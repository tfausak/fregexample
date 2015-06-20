(ns fregexample.core-test
  (:require [clojure.test :refer :all])
  (:import Fregexample))

(deftest collatz
  (is (= (Fregexample/collatz 0) 0))
  (is (= (Fregexample/collatz 1) 1))
  (is (= (Fregexample/collatz 2) 1))
  (is (= (Fregexample/collatz 3) 10)))
