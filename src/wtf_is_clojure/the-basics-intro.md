## Introdução a clojure

### Tudo é função

Clojure é uma linguagem derivada de LISP, uma das linguagens functionais mais famosas, logo clojure tambem é uma linguagem ``functional``, o que significa que absolutamente tudo em clojure é uma função. A linguagem computa uma funcao para chegar a um resultado

Na matematica quando escreviamos uma funcao era mais ou menos assim:

>`F(x, y)= x + y`
onde:
`F` é o nome da função
`x` e `y` são os parametros

e quando vamos utilizar chamamos `F(x, y)`. Logo, primeiro precisamos indicar a função que vamos utilizar, e então dizer quais os parametros que essa função vai receber, em clojre é a mesma coisa.

- Para indicar ao compilador que vamos invocar uma função precisamos abrir um parentesesassim toda funcao em clojure começa com
> ()
- Em seguida dizemos qual a funcao que vamos chamar, neste caso a funcao soma
> (+)
- E entao colocamos os parametros desejamos
> (+ 84 2)

O compilador vai entender que isso é uma função, vai procurar essa funcao que ja deve ser pre definida em algum lugar, vai chamar essa funcao passando os parametros recebidos.

####Em cojure é importante usar as funções que foram declaradas anteriormente, ou em outro namespace (tipo classe) que é referenciado pelo namespace atual



