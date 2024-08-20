(ns build
  (:require [clojure.tools.build.api :as b]))

(defn clean [& {}]
  (b/delete {:path "target"}))

(defn compile-java [& {}]
  (b/javac
    {:src-dirs   ["src/java"]
     :class-dir  "target/classes"
     :javac-opts ["--enable-preview"
                  "--source=22"]}))

(comment
  (compile-java))
