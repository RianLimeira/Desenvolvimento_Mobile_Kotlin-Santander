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
|E     | `&&`    |nesse caso toda a afirmação é verdadeira, caso uma das partes for falso, retorna False                     |
|Ou    | ` | | `    |avalia se uma das partes é verdadeira, para retornar True, caso todas as partes forem falsa, retorna False |

# Manipulacao de Strings
 - podem ser concatenadas com o '+', mas não é totalmente seguro
 - indexação
 - tratada como um array
 - fists(): visualiza a primeira posição (letra[0])
 - last(): visualiza a ultima posição (letra.last) ou (letra.length-1) OBS: o length, verifica o tamanho da palavra(string)
 - consegue deixar as letras todas minusculas ou maisculas
 - remover espaços
 - substituição de caracter
 - formatação

#Diferença entre Empty X Blank

 - Metodos comparativos
 - string vazia, branco ou nula
 - o Empty, é para quando está vazio, exemplo ""
 - o Blank, é para para quando está em branco, exemplo "    " ou ""(todos caracter estão em branco)

___
# Funções
 - utiliza prefixo "fun nomeDaFunção(nome:Tipo):TipoRetorno{}"
 - reutilização e simplificação de códigos
