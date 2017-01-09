(ns bob
  (:require [clojure.string :as str]))

(defn- silence? [msg] (str/blank? msg))

(defn- has-letter? [msg] (some #(or (Character/isUpperCase %)
                                    (Character/isLowerCase %)) msg))

(defn- shouting? [msg] (and (= msg (str/upper-case msg))
                            (has-letter? msg)))

(defn- question? [msg] (= \? (last msg)))

(defn my-square [x]
  "squares something"
  (* x x))

(defn response-for [input]
  (cond
    (silence? input)  "Fine. Be that way!" 
    (shouting? input) "Whoa, chill out!" 
    (question? input) "Sure."
    :else             "Whatever."))
