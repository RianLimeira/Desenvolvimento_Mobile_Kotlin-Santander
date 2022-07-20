package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 700.0

    salarios.forEach { println(it) }

    println("*".repeat(10))
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
    println("*".repeat(10))
    val bonus = doubleArrayOf(1500.0,1250.0,5000.0)
    bonus.sort()
    bonus.forEach { println(it) }
}

