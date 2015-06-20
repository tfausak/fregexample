(ns fregexample.core
  (:gen-class)
  (:import Fregexample))

(defn -main
  [& args]
  (let [frege-args (if args
                     (into-array args)
                     (make-array String 0))]
    (Fregexample/main frege-args)))
