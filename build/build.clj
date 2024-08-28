(ns build
  (:require [clojure.string :as str]
            [babashka.fs :as fs]
            [jextract :as jex]
            [clojure.tools.gitlibs :as gitlibs]
            [clojure.tools.build.api :as b]
            [clojure.java.io :as io]))



(defn clean [& {:as opts}]
  (b/delete {:path "target"}))

(defn build-xdg-headers [out-dir]
  ;; use wayland scanner to generate xdg-shell-protocol.h, used by wlroots
  (let [wl-proto-repo
        (gitlibs/procure
          "https://gitlab.freedesktop.org/wayland/wayland-protocols"
          'org.freedesktop/wayland-protocols
          ;; 1.23 latest
          "5d2edef111d03138157fa9d5581806abec05371e")
        xml-file    (str (fs/file wl-proto-repo "stable/xdg-shell/xdg-shell.xml"))
        out         (str (fs/file out-dir "xdg-shell-protocol.h"))
        output-type "server-header"]
    (b/process
      {:command-args ["wayland-scanner" output-type xml-file out]})))

(defn compile-java []
  (println "Compiling generated java")
  (b/javac {:src-dirs  ["target/gen"]
            :class-dir "target/classes"}))

(defn system-includes []
  (-> (b/process {:command-args ["gcc" "-E" "-Wp,-v" "-xc" "/dev/null"]
                  :err          :capture})
      :err
      str/split-lines
      (->> (drop-while #(not= % "#include <...> search starts here:"))
           (drop 1)
           (take-while #(not= % "End of search list."))
           (map str/trim))))

(defn build [& {:as opts}]
  (clean opts)
  (let [tmpdir   (fs/create-temp-dir {:prefix "tinywl-clj-build"})
        incdir   (str (doto (fs/file tmpdir "includes") fs/create-dirs))]

    (build-xdg-headers incdir)

    (spit (fs/file tmpdir "compile_flags.txt") "-DWLR_USE_UNSTABLE")

    (b/with-project-root (str tmpdir)
      (jex/jextract
        {:jextract-args
         (into (vec (interleave
                      (repeat "--include-dir")
                      (system-includes)))
           ["--output" "out"
            "--target-package" "dev.jt.tinywl_clj.gen"
            "--header-class-name" "C"

            "--library" "wlroots-0.18"
            "--library" "wayland-server"
            "--include-dir" "/usr/include/wlroots-0.18/"
            "--include-dir" "/usr/include/pixman-1"
            "--include-dir" incdir
            ;; Headers to generate classes for
            "<assert.h>"
            "<getopt.h>"
            "<stdbool.h>"
            "<stdlib.h>"
            "<stdio.h>"
            "<time.h>"
            "<unistd.h>"
            "<wayland-server-core.h>"
            "<wlr/backend.h>"
            "<wlr/render/allocator.h>"
            "<wlr/render/wlr_renderer.h>"
            "<wlr/types/wlr_cursor.h>"
            "<wlr/types/wlr_compositor.h>"
            "<wlr/types/wlr_data_device.h>"
            "<wlr/types/wlr_input_device.h>"
            "<wlr/types/wlr_keyboard.h>"
            "<wlr/types/wlr_output.h>"
            "<wlr/types/wlr_output_layout.h>"
            "<wlr/types/wlr_pointer.h>"
            "<wlr/types/wlr_scene.h>"
            "<wlr/types/wlr_seat.h>"
            "<wlr/types/wlr_subcompositor.h>"
            "<wlr/types/wlr_xcursor_manager.h>"
            "<wlr/types/wlr_xdg_shell.h>"
            "<wlr/util/log.h>"
            "<xkbcommon/xkbcommon.h>"])}))

    (b/copy-dir {:src-dirs   [(str (fs/file tmpdir "out"))]
                 :target-dir "target/gen"})
    (compile-java)))

(comment
  (system-includes)

  (build)
  )
