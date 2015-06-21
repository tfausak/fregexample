(defproject fregexample "0.0.0-SNAPSHOT"
  :description "An example Frege project."
  :url "https://github.com/tfausak/fregexample"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.frege-lang/frege "3.22.524-gcc99d7e"]]
  :plugins [[lein-fregec "3.22.524"]]
  :prep-tasks ["fregec"]
  :frege-source-paths ["source"]
  :main fregexample.Main
  :profiles {:test {:frege-source-paths ["test"]
                    :main fregexample.MainTest}
             :uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}}
  :repl-options {:prompt (fn [_] ">>> ")
                 :welcome ()})
