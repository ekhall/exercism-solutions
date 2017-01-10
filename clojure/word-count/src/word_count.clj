(ns word-count
  (:require [clojure.string :refer [split lower-case]]))

(defn word-count [words]
  "Given a sentence, returns a map with a count of each word.
   The original word, as a string, is the key. The value is an
   integer representing the number of occurences of this word."
  (let [cleaned-string (apply str (re-seq #"[a-zA-Z\s]" (lower-case words)))
        word-set (filter not-empty (-> cleaned-string (split #" ") (set)))
        word-map (zipmap word-set (take (count word-set) (repeat 1)))]
    word-map))

(word-count "car : Carpet as java : javascript!!&@$%^&")


