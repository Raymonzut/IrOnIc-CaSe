(ns ironic-case.core
  (:gen-class))

(defn ironize
  "Convert to ironic-case"
  [input]
  (let [casePairs (partition 2 2 [""] input)
        ironizePair #(str
                       (clojure.string/lower-case (first %))
                       (clojure.string/upper-case (second %)))]
      (apply str (map ironizePair casePairs))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
