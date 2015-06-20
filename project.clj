(defproject fregexample "0.0.1-SNAPSHOT"
  :description "A Frege example."
  :url "https://github.com/tfausak/fregexample"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[com.theoryinpractise.frege/frege "3.22.367-g2737683"]]
  :frege-source-paths ["source"]
  :plugins [[lein-fregec "3.22.367-i"]]
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
