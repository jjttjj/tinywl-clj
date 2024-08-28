(ns dev.jt.tinywl-clj
  (:require [clojure.java.process :as p]
            [clojure.tools.logging :as log]
            [clojure.string :as str]
            [clojure.java.io :as io])
  (:import [dev.jt.tinywl_clj.gen
            C
            timespec
            wl_list
            wl_listener
            wl_notify_func_t
            wl_notify_func_t$Function
            wl_signal
            wlr_backend
            wlr_backend$events
            wlr_box
            wlr_cursor
            wlr_cursor$events
            wlr_input_device
            wlr_input_device$events
            wlr_keyboard
            wlr_keyboard$events
            wlr_keyboard_key_event
            wlr_output
            wlr_output$events
            wlr_output_event_request_state
            wlr_output_layout
            wlr_output_state
            wlr_pointer
            wlr_pointer_button_event
            wlr_pointer_motion_absolute_event
            wlr_pointer_motion_event
            wlr_scene
            wlr_scene_node
            wlr_scene_surface
            wlr_scene_tree
            wlr_seat
            wlr_seat$events
            wlr_seat_keyboard_state
            wlr_seat_pointer_request_set_cursor_event
            wlr_seat_pointer_state
            wlr_seat_request_set_selection_event
            wlr_surface
            wlr_surface$events
            wlr_xdg_shell
            wlr_xdg_shell$events
            wlr_xdg_surface
            wlr_xdg_surface$events
            wlr_xdg_toplevel
            wlr_xdg_toplevel$events
            wlr_xdg_toplevel_resize_event]
           [java.lang.foreign
            AddressLayout
            Arena
            MemoryLayout
            MemorySegment
            SegmentAllocator
            ValueLayout
            ValueLayout$OfDouble
            ValueLayout$OfInt]))

(def NULL (-> (MemorySegment/ofAddress 0) (.reinterpret Long/MAX_VALUE)))
(defn null-ptr? [^MemorySegment seg] (= seg NULL))

(defn new-listener [{:keys [::arena] :as ctx} notifyf]
  (-> (wl_listener/allocate arena)
      (doto (wl_listener/notify
              (wl_notify_func_t/allocate
                (reify wl_notify_func_t$Function
                  (apply [this-func listener data]
                    (try
                      (notifyf (assoc ctx ::listener listener) data)
                      (catch Throwable t
                        (log/error t "error in listener")))))
                arena)))
      wl_listener/link))

(defn add-listener [ctx signal f]
  (-> signal
      wl_signal/listener_list
      wl_list/prev
      (C/wl_list_insert
        (new-listener ctx f))))

(defn on-request-state [ctx req-state-event]
  (C/wlr_output_commit_state
    (wlr_output_event_request_state/output req-state-event)
    (wlr_output_event_request_state/state req-state-event)))

(defn on-new-output [ctx output]
  (let [{:keys [::allocator ::renderer ::backend ::output-layout ::scene ::scene-layout]}
        ctx
        _     (C/wlr_output_init_render output allocator renderer)
        state (wlr_output_state/allocate (::arena ctx))
        _     (C/wlr_output_state_init state)
        oevents (wlr_output/events output)]
    (let [mode (C/wlr_output_preferred_mode output)]
      (when (not (null-ptr? mode))
        (C/wlr_output_state_set_mode state mode)))
    (C/wlr_output_state_set_enabled state true)
    (C/wlr_output_test_state  output state)
    (C/wlr_output_commit_state output state)
    (C/wlr_output_state_finish state)

    (add-listener ctx (wlr_output$events/frame oevents)
      (fn [ctx data]
        (with-open [a (Arena/ofConfined)]
          (let [scene-output (C/wlr_scene_get_scene_output (-> ctx ::scene) output)
                now          (timespec/allocate a)]
            (C/wlr_scene_output_commit scene-output MemorySegment/NULL)
            (C/clock_gettime 1 now)
            (C/wlr_scene_output_send_frame_done scene-output now)))))

    (add-listener ctx (wlr_output$events/request_state oevents)
      on-request-state)

    (add-listener ctx (wlr_output$events/destroy oevents)
      (fn [ctx output] (log/debug "output destroyed")))

    (let [scene-output  (C/wlr_scene_output_create scene output)
          layout-output (C/wlr_output_layout_add_auto output-layout output) ]
      (C/wlr_scene_output_layout_add_output
        scene-layout
        layout-output
        scene-output))))

(defn process-cursor-resize [{:keys [::cursor ::interactive] :as ctx} time]
  (let [{:keys [::grabbed-window ::grab-geo-box
                ::grab-x ::grab-y
                ::resize-edges]} @interactive
        border-x                 (- (wlr_cursor/x cursor) grab-x)
        border-y                 (- (wlr_cursor/y cursor) grab-y)
        left                     (wlr_box/x grab-geo-box)
        right                    (+ (wlr_box/x grab-geo-box) (wlr_box/width grab-geo-box))
        top                      (wlr_box/y grab-geo-box)
        bottom                   (+ (wlr_box/y grab-geo-box) (wlr_box/height grab-geo-box))

        top    (if (pos? (bit-and resize-edges (C/WLR_EDGE_TOP)))
                 (if (>= border-y bottom) (dec bottom) border-y)
                 top)
        bottom (if (and (zero? (bit-and resize-edges (C/WLR_EDGE_TOP)))
                        (pos? (bit-and resize-edges (C/WLR_EDGE_BOTTOM))))
                 (if (<= border-y top) (inc top) border-y)
                 bottom)
        left   (if (pos? (bit-and resize-edges (C/WLR_EDGE_LEFT)))
                 (if (>= border-x right) (dec right) border-x)
                 left)
        right  (if (and (zero? (bit-and resize-edges (C/WLR_EDGE_LEFT)))
                        (pos? (bit-and resize-edges (C/WLR_EDGE_RIGHT))))
                 (if (<= border-x left) (inc left) border-x)
                 right)

        width  (- right left)
        height (- bottom top)]
    (with-open [^Arena a (Arena/ofConfined)]
      (let [geo-box (.allocate a (wlr_box/layout))]
        (C/wlr_xdg_surface_get_geometry (wlr_xdg_toplevel/base
                                          (::toplevel grabbed-window)) geo-box)
        (C/wlr_scene_node_set_position
          (wlr_scene_tree/node (::scene-tree grabbed-window))
          (- left (wlr_box/x geo-box))
          (- top (wlr_box/y geo-box)))))
    (C/wlr_xdg_toplevel_set_size (::toplevel grabbed-window) width height)))

(defn process-cursor-move [{:keys [::cursor ::current-window ::interactive]} time]
  (let [{:keys [::grab-x ::grab-y ::grabbed-window]} @interactive]
    (C/wlr_scene_node_set_position
      (wlr_scene_tree/node (::scene-tree grabbed-window))
      (- (wlr_cursor/x cursor) grab-x)
      (- (wlr_cursor/y cursor) grab-y))))

(defn begin-interative [{:keys [::seat ::cursor ::interactive] :as ctx}
                        window
                        mode edges]
  (let [focused-srfc (-> (wlr_seat/pointer_state seat)
                         wlr_seat_pointer_state/focused_surface)

        {:keys [::scene-tree ::toplevel]} window]
    (when (= (-> (wlr_xdg_toplevel/base toplevel) wlr_xdg_surface/surface)
             (C/wlr_surface_get_root_surface focused-srfc))
      (let [scene-node (wlr_scene_tree/node scene-tree)]
        (cond
          (= mode :move)
          (swap! interactive merge
            {::grabbed-window window
             ::grab-x         (- (wlr_cursor/x cursor)
                              (wlr_scene_node/x scene-node))
             ::grab-y         (- (wlr_cursor/y cursor)
                              (wlr_scene_node/y scene-node))
             ::cursor-mode    mode})

          (= mode :resize)
          (let [grab-geo-box (.allocate ^Arena (::auto-arena ctx) (wlr_box/layout))
                _            (C/wlr_xdg_surface_get_geometry
                               (wlr_xdg_toplevel/base toplevel) grab-geo-box)
                border-x     (+ (wlr_scene_node/x scene-node)
                            (wlr_box/x grab-geo-box)
                            (if (pos? (bit-and edges (C/WLR_EDGE_RIGHT)))
                              (wlr_box/width grab-geo-box)
                              0))
                border-y
                (+ (wlr_scene_node/y scene-node)
                   (wlr_box/y grab-geo-box)
                   (if (pos? (bit-and edges (C/WLR_EDGE_BOTTOM)))
                     (wlr_box/height grab-geo-box)
                     0))]
            (wlr_box/x grab-geo-box (+ (wlr_box/x grab-geo-box)
                                       (wlr_scene_node/x scene-node)))
            (wlr_box/y grab-geo-box (+ (wlr_box/y grab-geo-box)
                                       (wlr_scene_node/y scene-node)))
            (swap! interactive merge
              {::cursor-mode    mode
               ::grabbed-window window
               ::resize-edges   edges
               ::grab-geo-box   grab-geo-box
               ::grab-x         (- (wlr_cursor/x cursor) border-x)
               ::grab-y         (- (wlr_cursor/y cursor) border-y)})))))))


(defn on-request-resize [ctx event]
  (begin-interative ctx (::window ctx) :resize (wlr_xdg_toplevel_resize_event/edges event)))

(defn on-request-move [ctx data]
  (begin-interative ctx (::window ctx) :move 0))

(defn focus-toplevel [{:keys [::keyboard ::seat ::windows] :as ctx}
                      {:keys [::toplevel ::scene-tree] :as window}
                      surface]
  (when toplevel
    (let [prev-surface (-> (wlr_seat/keyboard_state seat)
                           (wlr_seat_keyboard_state/focused_surface))
          keyboard     (C/wlr_seat_get_keyboard seat)]
      (when-not (= prev-surface surface)
        (when-not (null-ptr? prev-surface)
          (let [prev-toplevel (C/wlr_xdg_toplevel_try_from_wlr_surface prev-surface)]
            (when-not (null-ptr? prev-toplevel)
              (C/wlr_xdg_toplevel_set_activated prev-toplevel false))))
        ;; Focus the new surface
        (C/wlr_scene_node_raise_to_top (wlr_scene_tree/node scene-tree))
        (C/wlr_xdg_toplevel_set_activated toplevel true)
        ;; Move the window to the front
        (swap! windows (fn [wins] (cons window (remove #{window} wins))))
        (when-not (null-ptr? keyboard)
          (C/wlr_seat_keyboard_notify_enter seat surface
            (wlr_keyboard/keycodes keyboard)
            (wlr_keyboard/num_keycodes keyboard)
            (wlr_keyboard/modifiers keyboard)))))))

(defn on-request-maximize [{:keys [::window] :as ctx} data]
  ;; unsupported in tinywl, see their comment
  (C/wlr_xdg_surface_schedule_configure (wlr_xdg_toplevel/base (::toplevel window))))

(defn on-request-minimize [ctx data]
  (log/debug "TODO: minimize"))

(defn reset-cursor-mode [{:keys [::cursor ::cursor-mgr ::interactive] :as ctx}]
  (swap! interactive
    (fn [x]
      (-> (dissoc x
            ::grabbed-window
            ;; to allow garbage collection on the grab-geo-box in the auto
            ;; Arena (I think)
            ::grab-geo-box)
          (assoc ::cursor-mode :passthrough)))))

;;; tinywl (in wlroots 0.17) has a struct tinywl_toplevel to group toplevel + scene-tree
;;; I think they change the name in later versions
;;; I just call them windows, which is probably not a great name.
#_(s/def ::window (s/keys :req [::toplevel ::scene-tree]))


(defn on-new-xdg-toplevel [{:keys [::arena ::scene ::windows] :as ctx} toplevel]
  (let [xrfc  (wlr_xdg_toplevel/base toplevel)
        srfc (wlr_xdg_surface/surface xrfc)
        xrfc-events (wlr_xdg_surface/events xrfc)
        top-events  (wlr_xdg_toplevel/events toplevel)
        srfc-events (wlr_surface/events srfc)

        scene-tree
        (C/wlr_scene_xdg_surface_create
          (wlr_scene/tree scene)
          (wlr_xdg_toplevel/base toplevel))
        window {::toplevel   toplevel
                ::scene-tree scene-tree}]

    (-> (wlr_scene_tree/node scene-tree)
        ;;set a pointer value:
        (wlr_scene_node/data (.reinterpret toplevel 0)
          ;; or this works too (???)
          #_(.asSlice toplevel 0 0)))
    (wlr_xdg_surface/data xrfc (.reinterpret scene-tree 0))


    (add-listener (assoc ctx ::window window)
      (wlr_xdg_toplevel$events/request_move top-events)
      on-request-move)
    (add-listener (assoc ctx ::window window)
      (wlr_xdg_toplevel$events/request_resize top-events)
      on-request-resize)


    (add-listener ctx
      (wlr_surface$events/commit srfc-events)
      (fn [{:keys [::seat ::state] :as ctx} _data]
        (if (log/spy (wlr_xdg_surface/initial_commit xrfc))
          (C/wlr_xdg_toplevel_set_size toplevel 0 0))))

    (add-listener ctx
      (wlr_surface$events/map srfc-events)
      (fn [{:keys [::seat ::state] :as ctx} _data]
        (swap! windows conj window)
        (focus-toplevel ctx window srfc)))

    (add-listener ctx
      (wlr_surface$events/unmap srfc-events)
      (fn [ctx data]
        (swap! windows (fn [wins] (remove #{window} wins)))
        (reset-cursor-mode ctx)))

    (add-listener ctx
      (wlr_xdg_toplevel$events/destroy top-events)
      (fn [ctx data]
        (log/debug "toplevel destroyed")))

    (add-listener (assoc ctx ::window window)
      (wlr_xdg_toplevel$events/request_maximize top-events)
      on-request-maximize)
    (add-listener ctx
      (wlr_xdg_toplevel$events/request_minimize top-events)
      on-request-minimize)))


(defn deref-ptr [seg]
    (^[AddressLayout long] MemorySegment/.get seg ValueLayout/ADDRESS 0))

(defn copy-int-array [start-ptr n]
  (let [get-int     ^[ValueLayout$OfInt long] MemorySegment/.get
        to-array    ^[ValueLayout$OfInt] MemorySegment/.toArray
        reinterpret ^[long] MemorySegment/.reinterpret
        elements    ^[MemoryLayout] MemorySegment/.elements
        layout      (MemoryLayout/sequenceLayout n ValueLayout/JAVA_INT)]
    (-> start-ptr
        (reinterpret (.byteSize layout))
        (to-array ValueLayout/JAVA_INT))))

(comment
  (let [set-int ^[ValueLayout$OfInt long int] MemorySegment/.setAtIndex
        set-ptr ^[AddressLayout long MemorySegment] MemorySegment/.set]
    (with-open [arena (Arena/ofConfined)]
      (let [layout (MemoryLayout/sequenceLayout 100 ValueLayout/JAVA_INT)
            arr    (.allocate arena layout)
            ptr    (.allocate ^SegmentAllocator arena ValueLayout/ADDRESS)]
        (set-ptr ptr ValueLayout/ADDRESS 0 arr)
        (MemorySegment/.copyFrom arr (MemorySegment/ofArray (int-array (range 100))))
        (copy-int-array (deref-ptr ptr) 100)))))

(defn on-new-keyboard [{:keys [::auto-arena ::display ::seat ::state] :as ctx} device]
  (let [kbd (C/wlr_keyboard_from_input_device device)
        kbd-ctx (C/xkb_context_new (C/XKB_CONTEXT_NO_FLAGS))
        keymap (C/xkb_keymap_new_from_names kbd-ctx MemorySegment/NULL
                 (C/XKB_KEYMAP_COMPILE_NO_FLAGS))
        kevents (wlr_keyboard/events kbd)]
    (C/wlr_keyboard_set_keymap kbd keymap)
    (C/xkb_keymap_unref keymap)
    (C/xkb_context_unref kbd-ctx)
    (C/wlr_keyboard_set_repeat_info kbd 25 600)

    (add-listener ctx (wlr_keyboard$events/modifiers kevents)
      (fn [ctx _]
        (C/wlr_seat_set_keyboard seat kbd)
        (C/wlr_seat_keyboard_notify_modifiers seat (wlr_keyboard/modifiers kbd))))

    (add-listener ctx (wlr_keyboard$events/key kevents)
      (fn [ctx event]
        (let [keycode (wlr_keyboard_key_event/keycode event)
              syms*   (.allocate ^SegmentAllocator auto-arena C/C_POINTER)
              kstate (wlr_keyboard/xkb_state kbd)
              nsyms (C/xkb_state_key_get_syms kstate (+ keycode 8) syms*)
              [sym1 :as sym-arr] (copy-int-array (deref-ptr syms*) nsyms)
              pressed? (= (C/WL_KEYBOARD_KEY_STATE_PRESSED) (wlr_keyboard_key_event/state event))
              mods (C/wlr_keyboard_get_modifiers kbd)
              alt? (pos? (bit-and mods (C/WLR_MODIFIER_ALT)))]
          (condp = sym1
            (and pressed? alt? (C/XKB_KEY_Escape))
            (C/wl_display_terminate display)

            (and pressed? alt? (C/XKB_KEY_F1))
            (let [windows (::windows ctx)
                  wins    @windows]
              (when-let [w2 (second wins)]
                (reset! windows (take (count wins) (next (cycle wins))))
                (focus-toplevel ctx w2
                  (wlr_xdg_surface/surface (wlr_xdg_toplevel/base (::toplevel w2))))))
            ;; else
            (do
              (C/wlr_seat_set_keyboard seat kbd)
              (C/wlr_seat_keyboard_notify_key
                seat
                (wlr_keyboard_key_event/time_msec event)
                (wlr_keyboard_key_event/keycode event)
                (wlr_keyboard_key_event/state event)))))))

    (add-listener ctx (-> (wlr_input_device/events device) wlr_input_device$events/destroy)
      (fn [ctx d]
        (log/debug "keyboard destroyed")))

    (C/wlr_seat_set_keyboard (::seat ctx) kbd)))

(defn on-new-pointer [ctx pointer]
  (C/wlr_cursor_attach_input_device (::cursor ctx) pointer))

(defn on-new-input [ctx device]
  (condp = (wlr_input_device/type device)
    (C/WLR_INPUT_DEVICE_KEYBOARD) (on-new-keyboard ctx device)
    (C/WLR_INPUT_DEVICE_POINTER) (on-new-pointer ctx device))
  ;;todo: make sure we have a keyboard, etc
  (C/wlr_seat_set_capabilities (::seat ctx)
    (bit-or
      (C/WL_SEAT_CAPABILITY_POINTER)
      (C/WL_SEAT_CAPABILITY_KEYBOARD))))

(defn desktop-window-at [{:keys [::windows] :as ctx} lx ly]
  (with-open [a (Arena/ofConfined)]
    (let [sx (.allocate a ValueLayout/JAVA_DOUBLE)
          sy (.allocate a ValueLayout/JAVA_DOUBLE)
          node
          (C/wlr_scene_node_at
            (-> (wlr_scene/tree (::scene ctx))
                wlr_scene_tree/node)
            lx ly sx sy)]
      (when (not= NULL node)
        (let [scene-buf  (C/wlr_scene_buffer_from_node node)
              scene-surf (C/wlr_scene_surface_try_from_buffer scene-buf)]
          (when (not= NULL scene-surf)
            (let [surf (wlr_scene_surface/surface scene-surf)
                  [tree data]
                  (loop [tree (wlr_scene_node/parent node)]
                    (let [parent (wlr_scene_node/parent tree)
                          ;; data here is what we set in on-new-xdg-toplevel
                          data   (-> (wlr_scene_tree/node tree)
                                     wlr_scene_node/data)]
                      (if (or (null-ptr? parent)
                              (not (null-ptr? data)))
                        [tree data]
                        (recur parent))))]
              {:sx      (^[ValueLayout$OfDouble long] MemorySegment/.get sx ValueLayout/JAVA_DOUBLE 0)
               :sy      (^[ValueLayout$OfDouble long] MemorySegment/.get sy ValueLayout/JAVA_DOUBLE 0)
               :?window
               ;; ? to signify nil result possible (as distinct from NULL)
               (first (filter (comp #{data} ::toplevel) @windows))
               :?surface surf})))))))

(defn process-cursor-motion [{:keys [::arena ::seat ::cursor ::cursor-mgr ::interactive] :as ctx}
                             time]
  (condp = (::cursor-mode @interactive)
    :move
    (process-cursor-move ctx time)

    :resize
    (process-cursor-resize ctx time)

    ;; else
    (let [{:keys [:?window :?surface :sx :sy]}
          (desktop-window-at ctx (wlr_cursor/x cursor) (wlr_cursor/y cursor))]
      (when-not ?window
        (C/wlr_cursor_set_xcursor cursor cursor-mgr (.allocateFrom ^Arena arena "default")))
      (if ?surface
        (do
          (C/wlr_seat_pointer_notify_enter seat ?surface
            (wlr_cursor/x cursor)
            (wlr_cursor/y cursor))
          (C/wlr_seat_pointer_notify_motion seat time sx sy))
        (C/wlr_seat_pointer_clear_focus seat)))))


(defn on-cursor-motion [{:keys [::cursor ::cursor-mgr] :as ctx} event]
  (C/wlr_cursor_move cursor
    (-> (wlr_pointer_motion_event/pointer event) wlr_pointer/base)
    (wlr_pointer_motion_event/delta_x event)
    (wlr_pointer_motion_event/delta_y event))
  (process-cursor-motion ctx (wlr_pointer_motion_event/time_msec event)))


(defn on-cursor-motion-absolute [{:keys [::cursor] :as ctx} event]
  (C/wlr_cursor_warp_absolute cursor
    (-> (wlr_pointer_motion_absolute_event/pointer event)
        wlr_pointer/base)
    (wlr_pointer_motion_absolute_event/x event)
    (wlr_pointer_motion_absolute_event/y event))

  (process-cursor-motion ctx (wlr_pointer_motion_absolute_event/time_msec event)))


(defn on-cursor-button [{:keys [::cursor ::cursor-mgr] :as ctx} event]
  (C/wlr_seat_pointer_notify_button (::seat ctx)
    (wlr_pointer_button_event/time_msec event)
    (wlr_pointer_button_event/button event)
    (wlr_pointer_button_event/state event))
  (let [{:keys [:?window :?surface]} (desktop-window-at ctx (wlr_cursor/x cursor) (wlr_cursor/y cursor))]
    (if (= (C/WLR_BUTTON_RELEASED) (wlr_pointer_button_event/state event))
      (reset-cursor-mode ctx)
      (focus-toplevel ctx ?window ?surface))))


(defn on-cursor-frame [ctx event]
  (C/wlr_seat_pointer_notify_frame (::seat ctx)))

(defn on-cursor-axis [ctx event]
  (log/debug "cursor axis"))

(defn on-request-set-cursor [{:keys [::seat ::cursor] :as ctx} event]
  (let [focused (-> (wlr_seat/pointer_state seat)
                    wlr_seat_pointer_state/focused_client)]
    (if (= focused (wlr_seat_pointer_request_set_cursor_event/seat_client event))
      (C/wlr_cursor_set_surface cursor
        (wlr_seat_pointer_request_set_cursor_event/surface event)
        (wlr_seat_pointer_request_set_cursor_event/hotspot_x event)
        (wlr_seat_pointer_request_set_cursor_event/hotspot_y event)))))


(defn on-request-set-selection [ctx event]
  (C/wlr_seat_set_selection (::seat ctx)
    (wlr_seat_request_set_selection_event/source event)
    (wlr_seat_request_set_selection_event/serial event)))


(defn init-server []
  (let [arena         (Arena/ofShared)
        auto-arena    (Arena/ofAuto)
        disp          (C/wl_display_create)
        bak           (C/wlr_backend_autocreate (C/wl_display_get_event_loop disp) MemorySegment/NULL)
        _             (when (null-ptr? bak) (throw (ex-info "failed to create wlr_backend" {})))
        rend          (doto (C/wlr_renderer_autocreate bak)
                        (C/wlr_renderer_init_wl_display disp))
        _             (when (null-ptr? rend) (throw (ex-info "failed to create wlr_renderer" {})))
        alloc         (C/wlr_allocator_autocreate bak rend)
        _             (when (null-ptr? alloc) (throw (ex-info "failed to create wlr_allocator" {})))
        output-layout (C/wlr_output_layout_create disp)
        scene         (C/wlr_scene_create)
        scene-layout  (C/wlr_scene_attach_output_layout scene output-layout)
        xdg-shell     (C/wlr_xdg_shell_create disp 3)
        cursor        (C/wlr_cursor_create)
        cursor-mgr    (C/wlr_xcursor_manager_create MemorySegment/NULL 24)
        seat          (C/wlr_seat_create disp (.allocateFrom arena "seat0"))
        socket        (.getString ^MemorySegment (C/wl_display_add_socket_auto disp) 0)
        _             (when (null-ptr? socket) (throw (ex-info "failed to create wlr_socket" {})))
        ctx           {::arena         arena
                       ::auto-arena    auto-arena
                       ::allocator     alloc
                       ::display       disp
                       ::backend       bak
                       ::renderer      rend
                       ::output-layout output-layout
                       ::scene         scene
                       ::scene-layout  scene-layout
                       ::xdg-shell     xdg-shell
                       ::seat          seat
                       ::socket        socket
                       ::cursor        cursor
                       ::cursor-mgr    cursor-mgr


                       ::windows     (atom ())
                       ::interactive (atom {::cursor-mode    :passthrough
                                            ::grabbed-window nil
                                            ::grab-x         nil
                                            ::grab-y         nil
                                            ::grab-geo-box   nil
                                            ::resize-edges   nil})}]

    (C/wlr_cursor_attach_output_layout cursor output-layout)

    (let [bak-events (wlr_backend/events bak)]
      (add-listener ctx (wlr_backend$events/new_output bak-events) on-new-output)
      (add-listener ctx (wlr_backend$events/new_input bak-events) on-new-input))

    (let [c (wlr_cursor/events cursor)]
      (add-listener ctx (wlr_cursor$events/motion c) on-cursor-motion)
      (add-listener ctx (wlr_cursor$events/motion_absolute c) on-cursor-motion-absolute)
      (add-listener ctx (wlr_cursor$events/button c) on-cursor-button)
      (add-listener ctx (wlr_cursor$events/axis c) on-cursor-axis)
      (add-listener ctx (wlr_cursor$events/frame c) on-cursor-frame))

    (let [s (wlr_seat/events seat)]
      (add-listener ctx (wlr_seat$events/request_set_cursor s) on-request-set-cursor)
      (add-listener ctx (wlr_seat$events/request_set_selection s) on-request-set-selection))

    (C/wlr_compositor_create disp 5 rend)
    (C/wlr_subcompositor_create disp)
    (C/wlr_data_device_manager_create disp)

    (add-listener ctx (wlr_xdg_shell$events/new_toplevel (wlr_xdg_shell/events xdg-shell))
      on-new-xdg-toplevel)

    (add-listener ctx (wlr_xdg_shell$events/new_popup (wlr_xdg_shell/events xdg-shell))
      (fn [ctx _] (println "new popup")))

    ctx))

(defn display-run [{:keys [::display ::scene ::output-layout ::cursor-mgr
                           ::cursor ::renderer ::backend]}]
  (C/wl_display_run display)

  (C/wl_display_destroy_clients display)
  (C/wlr_scene_node_destroy (-> scene wlr_scene/tree wlr_scene_tree/node))
  (C/wlr_xcursor_manager_destroy cursor-mgr)
  (C/wlr_cursor_destroy cursor)
  (C/wlr_renderer_destroy renderer)
  (C/wlr_backend_destroy backend)
  (C/wl_display_destroy display))


(defn start [{:keys [spawn-args]}]
  (let [{:keys [::arena ::backend] :as srv} (init-server)]
    (with-open [^Arena arena arena]
      (try
        (when-not (null-ptr? (C/wlr_backend_start backend))
          (when spawn-args
            (future
              (apply p/exec
                {:env {"WAYLAND_DISPLAY" (::socket srv)}}
                spawn-args)))
          (display-run srv))
        (catch Throwable t
          (log/error t))))))

(defn -main [& [sflag & args]]
  ;;; va_args isn't well supported so we pass NULL here to use their default logger
  (C/wlr_log_init #_(C/WLR_ERROR) (C/WLR_DEBUG) MemorySegment/NULL)

  (when sflag
    (or (= sflag "-s") (throw (ex-info (str "`-s` is the only supported flag") {:args args})))
    (or (seq args) (throw (ex-info "No arguments passed to -s" {:args args}))))

  (start {:spawn-args args})
  (System/exit 0))

(comment
  (start {:spawn-args "foot"})
  )
