(ns podman
  (:require [clojure.tools.build.api :as b]
            [babashka.fs :as fs]
            [clojure.tools.build.api :as build]))

(defn build [{:keys [file tag]}]
  (b/process
    {:command-args
     ["podman" "build"
      "--volume" (str (fs/expand-home "~/.gitlibs") ":/root/.gitlibs")
      "--volume" (str (fs/expand-home "~/.m2") ":/root/.m2")
      "--file" file
      "--tag" tag "."]}))

(defn run [{:keys [tag]}]
  (let [wldisp (System/getenv "WAYLAND_DISPLAY")]
    (b/process
      {:command-args
       ["podman" "run"
        "--rm"
        "--security-opt" "label=disable"
        "--env" "XDG_RUNTIME_DIR=/tmp"
        "--env" (str "WAYLAND_DISPLAY=" wldisp)
        "--volume" (str (System/getenv "XDG_RUNTIME_DIR") "/" wldisp
                        ":" "/tmp/" wldisp ":ro")
        "--volume" (str (fs/expand-home "~/.gitlibs") ":/root/.gitlibs")
        "--volume" (str (fs/expand-home "~/.m2") ":/root/.m2")

        "--ipc" "host"
        "--interactive" "--tty"

        "--entrypoint" "clojure"
        tag
        "-M" "--report" "stderr" "-m" "dev.jt.tinywl-clj" "-s" "foot"]})))

(comment
  (build {:file "build/Dockerfile.arch"
          :tag "tinywl-clj:arch"})

  (run {:tag "tinywl-clj:arch"})

  (build {:file "build/Dockerfile.debian"
          :tag "tinywl-clj:debian"})

  (run {:tag "tinywl-clj:debian"})

  )
