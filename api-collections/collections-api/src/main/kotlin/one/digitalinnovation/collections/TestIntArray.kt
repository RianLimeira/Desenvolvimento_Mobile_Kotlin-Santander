package one.digitalinnovation.collections


fun main(){
    val linha:String = "*".repeat(10)
    val values = IntArray(5)
    values[0] = 1
    values[1] = 3
    values[2] = 2
    values[3] = 8
    values[4] = 5
    println(linha)
    for (valor in values){
        println(valor)
    }
    println(linha)
    //utiliza o 'it' para referencia
    values.forEach {
        println(it)
    }
    //mostra o resultado a cada posição
    println(linha)
    for (index in values.indices){
        println(values[index])
    }
    println(linha)
    //ordenação
    values.sort()
    for (valor in values) {
        println(valor)
    }
    println(linha)
}