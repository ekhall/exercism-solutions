(ns rna-transcription
  (:require [clojure.string :refer [replace]]
            [clojure.set :refer [subset?]]))

(defn to-rna [items]
  (assert (subset? (set items) #{\G \C \T \A}))
  (replace items #"G|C|T|A" {"G" "C" "C" "G" "T" "A" "A" "U"}))


(to-rna "ACAX")

;; Write a program that, given a DNA strand, returns its RNA complement
;; (per RNA transcription).

;; Both DNA and RNA strands are a sequence of nucleotides.

;; The four nucleotides found in DNA are
;; adenine (A),
;; cytosine (C),
;; guanine (G) and
;; thymine (T).

;; The four nucleotides found in RNA are
;; adenine (A),
;; cytosine (C),
;; guanine (G) and
;; uracil (U).

;; Given a DNA strand, its transcribed RNA strand is formed by replacing
;; each nucleotide with its complement:

;; G -> C
;; C -> G
;; T -> A
;; A -> U


