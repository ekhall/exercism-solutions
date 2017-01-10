(ns word-count
  (:require [clojure.string :refer [split]]))

(defn word-count [words]
  "Given a sentence, returns a map with a count of each word.
   The original word, as a string, is the key. The value is an
   integer representing the number of occurences of this word."
  (-> words
      (split #" ")
      (set)))
      



(word-count "words are here")

