(ns finder.core
  (:gen-class))

(def dictfile "words.txt")

(defn foldOverWords
  [folder init]
  (with-open [rdr (clojure.java.io/reader dictfile)]
    (reduce folder init (line-seq rdr))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (defn folder
    [acc cur]
    (doq)
    (println cur)
    (conj acc cur))
  (def result (foldOverWords folder []))
  (println result)
  )
