(ns cljs-first.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [cljs-first.core :refer [muzikant]]))

(deftest popok
  (testing "Konservatorya en avartel erkusn el xent"
    (testing " Kuzik + Muzikant = Kuzikant, etc"
      (is (=
           (muzikant "Tuzik")
           "Tuzikant"))
      (is (=
           (muzikant "Ruzik")
           "Ruzikant"))
      (is (=
           (muzikant "Ghzik")
           "Ghzikant"))))
  (testing "Bayc asenq ete grum em muzikant araqsya"
    (is (not (=
              (muzikant "araqsya")
              "araqsyaant")))))
