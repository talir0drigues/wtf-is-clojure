(ns base-64-nao-eh-criptografia.base64-encoder)

(defn incrementer [letter]
  (+ letter 3))

(defn encoder [text]
  (->> (seq (char-array text))  ; (\b \a \n \a \n \a)
       (map byte) ; (98 97 110 97 110 97)
       (map incrementer)  ; (101 100 113 100 113 100)
       (map char) ;(\e \d \q \d \q \d)
       (apply str))) ;"edqdqd"