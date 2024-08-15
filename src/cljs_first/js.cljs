(ns cljs-first.js
  (:require [cljs-first.core :refer [muzikant]]))

(defn -main
  [args]
  (println (muzikant args)))

(set! *main-cli-fn* -main)
