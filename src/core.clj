(ns core
  (:use quil.core))


(defn setup [])


(defn draw []
  (background 153)
  (line 0 0 300 300)
  (exit))


(defsketch circles
  :title "Circles"
  :setup setup

  :rendered :pdf
  :output-file "D:/tt.pdf"

  :draw draw
  :size [300 300])

(defn -main [] ())

