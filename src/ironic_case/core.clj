(ns ironic-case.core
  (:gen-class))

(defn ironize
  "Convert to ironic-case"
  [input]
  (->> input
    (partition 2 2 [""])
    (map #(str
           (clojure.string/lower-case (first %))
           (clojure.string/upper-case (second %))))
    (apply str)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
