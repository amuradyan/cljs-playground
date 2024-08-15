(defproject cljs-first "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojurescript "1.11.132"]
                 [org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns cljs-first.core}
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.25.0"]
                             [lein-cljsbuild "1.1.8"]]}}
  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "war/javascripts/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
