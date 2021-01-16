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
```clojure
()
```
- Em seguida dizemos qual a funcao que vamos chamar, neste caso a funcao soma
```clojure
(+)
```
- E entao colocamos os parametros desejamos
```clojure
(+ 84 2)
```

O compilador vai entender que isso é uma função, vai procurar essa funcao que ja deve ser pre definida em algum lugar, vai chamar essa funcao passando os parametros recebidos.

####Em clojure é importante usar as funções que foram declaradas anteriormente, ou em outro namespace (tipo classe) que é referenciado pelo namespace atual


### If meu amor, cade voce?

Já deu pra ver que em clojure as coisas sao meio fora da caixa certo? a nossa estrutura de if existe! ...só nao do jeito tradicional.

A estrutura padrão do if é
```clojure
(if condicao
  resultado-positivo
  resultado-negativo)
```

### uma outra proposta de for

Em clojure usamos muito mapa, eh mapa pra tudo quando é lado.
porem alem de ser uma estrutura de dados em clojure, map tbm eh uma funcao. essa funcao tem o objetivo de mapiar mesmo um conjunto de parametros de entrada numa funcao definida no map

```clojure
(map funcao parametros-de-entrada)
```

### pera, mas cade as variavies?

Em clojure não existem variaveis como no java, onde vc define um contator do tipo `int`, ou coisa do tipo, e vai atualizando porque clojure é uma linguagem imutavel, sendo assim um dado nao muda seu estado.
Por isso temos a função `def`. Essa função é responsavel por fazer a ligacao entre um valor e um simbolo.

```clojure 
(def ack 456)
```
Na função acima nós ligamos o simbolo ack ao valor 456, isso significa que sempre que usarmos ack, estaremos na verdade usando 456.


### to pegando a ideia! mas como declaro uma funcao entao?

```clojure 
(defn nome-funcao  [parametros]
    corpo da funcao)
```
