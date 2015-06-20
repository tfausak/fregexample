(defproject fregexample "0.0.0-SNAPSHOT"
  :description "A Frege example."
  :url "https://github.com/tfausak/fregexample"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.theoryinpractise.frege/frege "3.22.367-g2737683"]]
  :plugins [[lein-fregec "3.22.367-i"]]
  :source-paths ["source/clojure"]
  :frege-source-paths ["source/frege"]
  :main fregexample.core
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
