(ns tiy-homework-fizz-buzz-clojure.core)

;(for [x (range 0 13)
;      y (range 0 13)]
;  (str x " * " y " = " (* x y)))

;(defn -main[]

(defn fizz-buzz [start end]
      (for [x (range start end)]
        (cond (= (mod x 15) 0) (str "FizzBuzz")
              (= (mod x 3) 0) (str "Fizz")
              (= (mod x 5) 0) (str "Buzz")
              :else (str x))))



;(defn echo [word times]
;  (loop [word word
;         times times
;         accumulator ""]
;    (if (= times 0)
;      accumulator
;      (recur word (- times 1) (str accumulator " " word)))))
;

;old code that didnt work
;(if (= (mod x 15) 0)
;  (println "FizzBuzz"
;           (if (= (mod x 5) 0)
;             (println "Buzz"
;                      (if (= (mod x 3) 0)
;                        (println "Fizz")
;                        (println x))))))

;(fizz-buzz 1 100)

;(-main)

(println (fizz-buzz 1 101))
