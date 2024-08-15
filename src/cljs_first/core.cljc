(ns cljs-first.core)

(defn muzikant
  [word]
  (if (nil? (re-matches #"(.*)zik" word))
    word
    (str word "ant")))
