(ns ironic-case.core-test
  (:require [clojure.test :refer :all]
            [ironic-case.core :refer :all]))

(deftest ironize-test
  (testing "Empty string on empty input"
    (is (= (ironize "") "")))
  (testing "First character lowercase given uppercase"
    (is (= (ironize "A") "a")))
  (testing "Second character uppercase given lowercase"
    (is (= (second (ironize "Ab")) \B))))
