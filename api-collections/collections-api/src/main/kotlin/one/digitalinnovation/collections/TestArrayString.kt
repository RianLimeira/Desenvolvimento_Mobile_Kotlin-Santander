package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Rian"
    nomes[1] = "Daniel"
    nomes[2] = "Gabriely"

    for (nome in nomes) {
        println(nome)
    }
    println("*".repeat(10))
    nomes.sort()
    nomes.forEach { println(it) }

    println("*".repeat(10))
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}