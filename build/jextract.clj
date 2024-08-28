(ns jextract
  (:require [clojure.tools.gitlibs :as gitlibs]
            [clojure.tools.build.api :as b]
            [clojure.java.io :as io]
            [babashka.fs :as fs])
  (:import [org.bytedeco.javacpp Loader]
           [org.bytedeco.javacpp.annotation Platform]))

(def jextract-sha "e55aacfda23211406552357095b6eb780f0fa8e5")

(def jextract-root
  (delay
    (gitlibs/procure "https://github.com/openjdk/jextract"
      'org.openjdk/jextract
      jextract-sha)))

(def class-dir "build/target/classes")
(def jar-file "build/target/jextract.jar")

(defn get-lib-dir []
  (let [platform-props (Loader/loadProperties)
        clazz          org.bytedeco.llvm.presets.clang
        lib-props      (Loader/loadProperties clazz platform-props true)
        libstr         "clang:@13"
        url            (first (Loader/findLibrary clazz lib-props libstr false))
        resource-dir   (Loader/cacheResource ^java.net.URL url)
        symlink-dir (fs/create-temp-dir {:prefix "cljextract-clang-"})]
    (fs/delete-on-exit symlink-dir)
    (doseq [f (fs/list-dir resource-dir)]
      (fs/create-sym-link
        (fs/path symlink-dir (fs/file-name f))
        f))
    (doseq [f (fs/list-dir symlink-dir)]
      (Loader/createLibraryLink (str (fs/absolutize f))
        lib-props libstr (make-array String 0)))
    symlink-dir))

(defn get-library-path-env-name []
  "LD_LIBRARY_PATH"
  ;; Only linux support makes sense for a wayland thing
  #_(case (System/getProperty "os.name")
      "Windows"  "PATH"
      "Mac OS X" "DYLD_LIBRARY_PATH"
      "Linux"    "LD_LIBRARY_PATH"
      :else
      (throw (UnsupportedOperationException. "Unsupported operating system"))))

(defn clean [& {:as opts}]
  (b/delete {:path "build/target"})
  opts)

(defn compile-jextract [& {:as opts}]
  (println "compiling java...")
  (b/javac
    {:src-dirs   [(str (io/file @jextract-root "src/main/java"))]
     :class-dir  class-dir
     :javac-opts ["--enable-preview"
                  "--source=22"]})
  (b/copy-dir
    {:src-dirs   [(str (io/file @jextract-root "src/main/resources"))
                  class-dir]
     :target-dir class-dir})
  opts)

(defn jextract-jar [& {:as opts}]
  (compile-jextract)
  (b/jar {:class-dir class-dir
          :jar-file jar-file})
  opts)

(comment
  (clean)
  (jextract-jar)
  )

(defn jextract [{:keys [jextract-args]}]
  (when-not (.exists (io/file jar-file))
    (jextract-jar))
  (let [lib-var  (get-library-path-env-name)
        lib-path (str (get-lib-dir)
                      (some->> (System/getenv lib-var)
                               (str fs/path-separator)))
        env      {lib-var lib-path}]
    (-> (b/java-command
          {:cp        [jar-file]
           :main      "org.openjdk.jextract.JextractTool"
           :basis     {}
           :main-args jextract-args})
        (assoc :env env)
        b/process)))
