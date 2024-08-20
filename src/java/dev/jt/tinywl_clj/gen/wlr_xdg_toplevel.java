// Generated by jextract

package dev.jt.tinywl_clj.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct wlr_xdg_toplevel {
 *     struct wl_resource *resource;
 *     struct wlr_xdg_surface *base;
 *     struct wlr_xdg_toplevel *parent;
 *     struct wl_listener parent_unmap;
 *     struct wlr_xdg_toplevel_state current;
 *     struct wlr_xdg_toplevel_state pending;
 *     struct wlr_xdg_toplevel_configure scheduled;
 *     struct wlr_xdg_toplevel_requested requested;
 *     char *title;
 *     char *app_id;
 *     struct {
 *         struct wl_signal request_maximize;
 *         struct wl_signal request_fullscreen;
 *         struct wl_signal request_minimize;
 *         struct wl_signal request_move;
 *         struct wl_signal request_resize;
 *         struct wl_signal request_show_window_menu;
 *         struct wl_signal set_parent;
 *         struct wl_signal set_title;
 *         struct wl_signal set_app_id;
 *     } events;
 * }
 * }
 */
public class wlr_xdg_toplevel {

    wlr_xdg_toplevel() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("resource"),
        C.C_POINTER.withName("base"),
        C.C_POINTER.withName("parent"),
        wl_listener.layout().withName("parent_unmap"),
        wlr_xdg_toplevel_state.layout().withName("current"),
        wlr_xdg_toplevel_state.layout().withName("pending"),
        wlr_xdg_toplevel_configure.layout().withName("scheduled"),
        MemoryLayout.paddingLayout(4),
        wlr_xdg_toplevel_requested.layout().withName("requested"),
        C.C_POINTER.withName("title"),
        C.C_POINTER.withName("app_id"),
        wlr_xdg_toplevel.events.layout().withName("events")
    ).withName("wlr_xdg_toplevel");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout resource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("resource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static final AddressLayout resource$layout() {
        return resource$LAYOUT;
    }

    private static final long resource$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static final long resource$offset() {
        return resource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static MemorySegment resource(MemorySegment struct) {
        return struct.get(resource$LAYOUT, resource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static void resource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(resource$LAYOUT, resource$OFFSET, fieldValue);
    }

    private static final AddressLayout base$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *base
     * }
     */
    public static final AddressLayout base$layout() {
        return base$LAYOUT;
    }

    private static final long base$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *base
     * }
     */
    public static final long base$offset() {
        return base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *base
     * }
     */
    public static MemorySegment base(MemorySegment struct) {
        return struct.get(base$LAYOUT, base$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_surface *base
     * }
     */
    public static void base(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(base$LAYOUT, base$OFFSET, fieldValue);
    }

    private static final AddressLayout parent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("parent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *parent
     * }
     */
    public static final AddressLayout parent$layout() {
        return parent$LAYOUT;
    }

    private static final long parent$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *parent
     * }
     */
    public static final long parent$offset() {
        return parent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *parent
     * }
     */
    public static MemorySegment parent(MemorySegment struct) {
        return struct.get(parent$LAYOUT, parent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel *parent
     * }
     */
    public static void parent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(parent$LAYOUT, parent$OFFSET, fieldValue);
    }

    private static final GroupLayout parent_unmap$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_unmap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_listener parent_unmap
     * }
     */
    public static final GroupLayout parent_unmap$layout() {
        return parent_unmap$LAYOUT;
    }

    private static final long parent_unmap$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_listener parent_unmap
     * }
     */
    public static final long parent_unmap$offset() {
        return parent_unmap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_listener parent_unmap
     * }
     */
    public static MemorySegment parent_unmap(MemorySegment struct) {
        return struct.asSlice(parent_unmap$OFFSET, parent_unmap$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_listener parent_unmap
     * }
     */
    public static void parent_unmap(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_unmap$OFFSET, parent_unmap$LAYOUT.byteSize());
    }

    private static final GroupLayout current$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("current"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state current
     * }
     */
    public static final GroupLayout current$layout() {
        return current$LAYOUT;
    }

    private static final long current$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state current
     * }
     */
    public static final long current$offset() {
        return current$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state current
     * }
     */
    public static MemorySegment current(MemorySegment struct) {
        return struct.asSlice(current$OFFSET, current$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state current
     * }
     */
    public static void current(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, current$OFFSET, current$LAYOUT.byteSize());
    }

    private static final GroupLayout pending$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pending"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state pending
     * }
     */
    public static final GroupLayout pending$layout() {
        return pending$LAYOUT;
    }

    private static final long pending$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state pending
     * }
     */
    public static final long pending$offset() {
        return pending$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state pending
     * }
     */
    public static MemorySegment pending(MemorySegment struct) {
        return struct.asSlice(pending$OFFSET, pending$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_state pending
     * }
     */
    public static void pending(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pending$OFFSET, pending$LAYOUT.byteSize());
    }

    private static final GroupLayout scheduled$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("scheduled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure scheduled
     * }
     */
    public static final GroupLayout scheduled$layout() {
        return scheduled$LAYOUT;
    }

    private static final long scheduled$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure scheduled
     * }
     */
    public static final long scheduled$offset() {
        return scheduled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure scheduled
     * }
     */
    public static MemorySegment scheduled(MemorySegment struct) {
        return struct.asSlice(scheduled$OFFSET, scheduled$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_configure scheduled
     * }
     */
    public static void scheduled(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, scheduled$OFFSET, scheduled$LAYOUT.byteSize());
    }

    private static final GroupLayout requested$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("requested"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_requested requested
     * }
     */
    public static final GroupLayout requested$layout() {
        return requested$LAYOUT;
    }

    private static final long requested$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_requested requested
     * }
     */
    public static final long requested$offset() {
        return requested$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_requested requested
     * }
     */
    public static MemorySegment requested(MemorySegment struct) {
        return struct.asSlice(requested$OFFSET, requested$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_toplevel_requested requested
     * }
     */
    public static void requested(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, requested$OFFSET, requested$LAYOUT.byteSize());
    }

    private static final AddressLayout title$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("title"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *title
     * }
     */
    public static final AddressLayout title$layout() {
        return title$LAYOUT;
    }

    private static final long title$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *title
     * }
     */
    public static final long title$offset() {
        return title$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *title
     * }
     */
    public static MemorySegment title(MemorySegment struct) {
        return struct.get(title$LAYOUT, title$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *title
     * }
     */
    public static void title(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(title$LAYOUT, title$OFFSET, fieldValue);
    }

    private static final AddressLayout app_id$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("app_id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *app_id
     * }
     */
    public static final AddressLayout app_id$layout() {
        return app_id$LAYOUT;
    }

    private static final long app_id$OFFSET = 208;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *app_id
     * }
     */
    public static final long app_id$offset() {
        return app_id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *app_id
     * }
     */
    public static MemorySegment app_id(MemorySegment struct) {
        return struct.get(app_id$LAYOUT, app_id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *app_id
     * }
     */
    public static void app_id(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(app_id$LAYOUT, app_id$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal request_maximize;
     *     struct wl_signal request_fullscreen;
     *     struct wl_signal request_minimize;
     *     struct wl_signal request_move;
     *     struct wl_signal request_resize;
     *     struct wl_signal request_show_window_menu;
     *     struct wl_signal set_parent;
     *     struct wl_signal set_title;
     *     struct wl_signal set_app_id;
     * }
     * }
     */
    public static class events {

        events() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wl_signal.layout().withName("request_maximize"),
            wl_signal.layout().withName("request_fullscreen"),
            wl_signal.layout().withName("request_minimize"),
            wl_signal.layout().withName("request_move"),
            wl_signal.layout().withName("request_resize"),
            wl_signal.layout().withName("request_show_window_menu"),
            wl_signal.layout().withName("set_parent"),
            wl_signal.layout().withName("set_title"),
            wl_signal.layout().withName("set_app_id")
        ).withName("$anon$186:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout request_maximize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("request_maximize"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal request_maximize
         * }
         */
        public static final GroupLayout request_maximize$layout() {
            return request_maximize$LAYOUT;
        }

        private static final long request_maximize$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal request_maximize
         * }
         */
        public static final long request_maximize$offset() {
            return request_maximize$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal request_maximize
         * }
         */
        public static MemorySegment request_maximize(MemorySegment struct) {
            return struct.asSlice(request_maximize$OFFSET, request_maximize$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal request_maximize
         * }
         */
        public static void request_maximize(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, request_maximize$OFFSET, request_maximize$LAYOUT.byteSize());
        }

        private static final GroupLayout request_fullscreen$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("request_fullscreen"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal request_fullscreen
         * }
         */
        public static final GroupLayout request_fullscreen$layout() {
            return request_fullscreen$LAYOUT;
        }

        private static final long request_fullscreen$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal request_fullscreen
         * }
         */
        public static final long request_fullscreen$offset() {
            return request_fullscreen$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal request_fullscreen
         * }
         */
        public static MemorySegment request_fullscreen(MemorySegment struct) {
            return struct.asSlice(request_fullscreen$OFFSET, request_fullscreen$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal request_fullscreen
         * }
         */
        public static void request_fullscreen(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, request_fullscreen$OFFSET, request_fullscreen$LAYOUT.byteSize());
        }

        private static final GroupLayout request_minimize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("request_minimize"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal request_minimize
         * }
         */
        public static final GroupLayout request_minimize$layout() {
            return request_minimize$LAYOUT;
        }

        private static final long request_minimize$OFFSET = 32;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal request_minimize
         * }
         */
        public static final long request_minimize$offset() {
            return request_minimize$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal request_minimize
         * }
         */
        public static MemorySegment request_minimize(MemorySegment struct) {
            return struct.asSlice(request_minimize$OFFSET, request_minimize$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal request_minimize
         * }
         */
        public static void request_minimize(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, request_minimize$OFFSET, request_minimize$LAYOUT.byteSize());
        }

        private static final GroupLayout request_move$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("request_move"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal request_move
         * }
         */
        public static final GroupLayout request_move$layout() {
            return request_move$LAYOUT;
        }

        private static final long request_move$OFFSET = 48;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal request_move
         * }
         */
        public static final long request_move$offset() {
            return request_move$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal request_move
         * }
         */
        public static MemorySegment request_move(MemorySegment struct) {
            return struct.asSlice(request_move$OFFSET, request_move$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal request_move
         * }
         */
        public static void request_move(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, request_move$OFFSET, request_move$LAYOUT.byteSize());
        }

        private static final GroupLayout request_resize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("request_resize"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal request_resize
         * }
         */
        public static final GroupLayout request_resize$layout() {
            return request_resize$LAYOUT;
        }

        private static final long request_resize$OFFSET = 64;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal request_resize
         * }
         */
        public static final long request_resize$offset() {
            return request_resize$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal request_resize
         * }
         */
        public static MemorySegment request_resize(MemorySegment struct) {
            return struct.asSlice(request_resize$OFFSET, request_resize$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal request_resize
         * }
         */
        public static void request_resize(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, request_resize$OFFSET, request_resize$LAYOUT.byteSize());
        }

        private static final GroupLayout request_show_window_menu$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("request_show_window_menu"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal request_show_window_menu
         * }
         */
        public static final GroupLayout request_show_window_menu$layout() {
            return request_show_window_menu$LAYOUT;
        }

        private static final long request_show_window_menu$OFFSET = 80;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal request_show_window_menu
         * }
         */
        public static final long request_show_window_menu$offset() {
            return request_show_window_menu$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal request_show_window_menu
         * }
         */
        public static MemorySegment request_show_window_menu(MemorySegment struct) {
            return struct.asSlice(request_show_window_menu$OFFSET, request_show_window_menu$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal request_show_window_menu
         * }
         */
        public static void request_show_window_menu(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, request_show_window_menu$OFFSET, request_show_window_menu$LAYOUT.byteSize());
        }

        private static final GroupLayout set_parent$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("set_parent"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal set_parent
         * }
         */
        public static final GroupLayout set_parent$layout() {
            return set_parent$LAYOUT;
        }

        private static final long set_parent$OFFSET = 96;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal set_parent
         * }
         */
        public static final long set_parent$offset() {
            return set_parent$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal set_parent
         * }
         */
        public static MemorySegment set_parent(MemorySegment struct) {
            return struct.asSlice(set_parent$OFFSET, set_parent$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal set_parent
         * }
         */
        public static void set_parent(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, set_parent$OFFSET, set_parent$LAYOUT.byteSize());
        }

        private static final GroupLayout set_title$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("set_title"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal set_title
         * }
         */
        public static final GroupLayout set_title$layout() {
            return set_title$LAYOUT;
        }

        private static final long set_title$OFFSET = 112;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal set_title
         * }
         */
        public static final long set_title$offset() {
            return set_title$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal set_title
         * }
         */
        public static MemorySegment set_title(MemorySegment struct) {
            return struct.asSlice(set_title$OFFSET, set_title$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal set_title
         * }
         */
        public static void set_title(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, set_title$OFFSET, set_title$LAYOUT.byteSize());
        }

        private static final GroupLayout set_app_id$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("set_app_id"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal set_app_id
         * }
         */
        public static final GroupLayout set_app_id$layout() {
            return set_app_id$LAYOUT;
        }

        private static final long set_app_id$OFFSET = 128;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal set_app_id
         * }
         */
        public static final long set_app_id$offset() {
            return set_app_id$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal set_app_id
         * }
         */
        public static MemorySegment set_app_id(MemorySegment struct) {
            return struct.asSlice(set_app_id$OFFSET, set_app_id$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal set_app_id
         * }
         */
        public static void set_app_id(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, set_app_id$OFFSET, set_app_id$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this struct
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout events$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("events"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal request_maximize;
     *     struct wl_signal request_fullscreen;
     *     struct wl_signal request_minimize;
     *     struct wl_signal request_move;
     *     struct wl_signal request_resize;
     *     struct wl_signal request_show_window_menu;
     *     struct wl_signal set_parent;
     *     struct wl_signal set_title;
     *     struct wl_signal set_app_id;
     * } events
     * }
     */
    public static final GroupLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 216;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal request_maximize;
     *     struct wl_signal request_fullscreen;
     *     struct wl_signal request_minimize;
     *     struct wl_signal request_move;
     *     struct wl_signal request_resize;
     *     struct wl_signal request_show_window_menu;
     *     struct wl_signal set_parent;
     *     struct wl_signal set_title;
     *     struct wl_signal set_app_id;
     * } events
     * }
     */
    public static final long events$offset() {
        return events$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal request_maximize;
     *     struct wl_signal request_fullscreen;
     *     struct wl_signal request_minimize;
     *     struct wl_signal request_move;
     *     struct wl_signal request_resize;
     *     struct wl_signal request_show_window_menu;
     *     struct wl_signal set_parent;
     *     struct wl_signal set_title;
     *     struct wl_signal set_app_id;
     * } events
     * }
     */
    public static MemorySegment events(MemorySegment struct) {
        return struct.asSlice(events$OFFSET, events$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal request_maximize;
     *     struct wl_signal request_fullscreen;
     *     struct wl_signal request_minimize;
     *     struct wl_signal request_move;
     *     struct wl_signal request_resize;
     *     struct wl_signal request_show_window_menu;
     *     struct wl_signal set_parent;
     *     struct wl_signal set_title;
     *     struct wl_signal set_app_id;
     * } events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, events$OFFSET, events$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
