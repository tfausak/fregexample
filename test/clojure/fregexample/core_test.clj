(ns fregexample.core-test
  (:require [clojure.test :refer :all])
  (:import fregexample.Main))

(deftest collatz
  (is (= (fregexample.Main/collatz 0) 0))
  (is (= (fregexample.Main/collatz 1) 1))
  (is (= (fregexample.Main/collatz 2) 1))
  (is (= (fregexample.Main/collatz 3) 10)))
