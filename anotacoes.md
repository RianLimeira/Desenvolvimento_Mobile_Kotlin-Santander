# Variavies em Kotlin

 - var: elementos podem ser alterados/modificados durante a execução - camelCase (ex: alunoEndereco)
 - val: elementos não podem ser alterados durante a execução - camelCase (ex: alunoNota)
 - conta val: elementos não podem ser alterados, são totalmente fixos, e são somente alterados na compilação (durante a criação do código) - SNAKE_CASE (ex: IDADE_MINIMA e IDADE_MAXIMA)
___
# Nullability
 - permite valores determinados ou nulos
 - utilizar a interrogação (?), exemplo: var month:Int? = null
 ___
# Operadores Aritméticos
 |  Função      | Expressão | Comando  | Atribuição|
 |--------------|-----------|----------|-----------|
 | soma:        |  +        |a.plus(b) |a+=b       |
 | subtração:   |  -        |a.minus(b)|a-=b       |
 | multiplicação|  *        |a.times(b)|a*=b       |
 | divisão:     |  /        |a.div(b)  |a/=b       |
 | resto:       |  %        |a.mod(b)  |a%=b       |

OBS: a função soma, também serve para unir(concatenar) strings(textos/letras)

# Operadres Comparativos
 - Maior/Menos: >(maior) <(menor)
 - Maior/menor ou igual: >=(maior ou igual) ou <= (menor ou igual)
 - igual: ==
 - diferente: !=

# Operadores Lógicos
|Função|Expressão|Casos                                                                                                      |
|---   |---      |---                                                                                                        |
|E     | '&&'    |nesse caso toda a afirmação é verdadeira, caso uma das partes for falso, retorna False                     |
|Ou    | '||'    |avalia se uma das partes é verdadeira, para retornar True, caso todas as partes forem falsa, retorna False |
