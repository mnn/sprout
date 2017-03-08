(defproject sprout-lein "1.2.3"
  :plugins [[lein-cljsbuild "1.1.5"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.495"]
                 [binaryage/devtools "0.9.2"]]
  :cljsbuild {
              :builds [{
                        :source-paths ["src"]
                        :compiler     {
                                       :output-dir   "out/js"
                                       :output-to    "out/js/main.js"
                                       ;:preloads     ["devtools.preload"]
                                       ;:main         "app.main"
                                       :asset-path   "js"
                                       :optimizations :none
                                       ;:optimizations :advanced
                                       :pretty-print true
                                       }}]})
