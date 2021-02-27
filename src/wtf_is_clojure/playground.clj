(ns wtf-is-clojure.playground)

(defn calc-poly
  [a-list b-list x]
  (reduce + (map
              (fn [a b]
                (Math/pow (* a x) b))
              a-list
              b-list)))

(defn calc-trapezio
  [base highs]
  (/ (* (reduce + highs) base) 2))

(defn calc-volume
  [a-list b-list ini end interval]
  (->>
    (map (partial calc-poly a-list b-list) (range ini end interval))
    (partition 2 1)
    (map (partial calc-trapezio interval))
    (reduce +)
    ))

(calc-volume [1 2 3] [4 5 6] 4 5 0.001)