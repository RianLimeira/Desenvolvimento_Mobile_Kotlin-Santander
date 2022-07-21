package one.digitalinnovation.collections

fun main(){
    val pair: Pair<String, Double> = Pair("Rian", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - valor: $v") }

    val map2 = mapOf(
        "Gabriely" to  2500.0,
        "Daniel" to 3000.0
    )
    map2.forEach { (k,v) -> println("Chave: $k - valor: $v" ) }
}