package one.digitalinnovation.collections

fun main() {
    val rian = Funcionario("Rian", 1500.0, "CLT")
    val gabriely = Funcionario ("Gabriely", 3000.0, "PJ")
    val daniel = Funcionario ("Daniel", 2500.0, "PJ")

    println("--------LIST-------")
    val funcionarios = mutableListOf(rian, gabriely)
    funcionarios.forEach { println(it) }
    println("*".repeat(10))

    funcionarios.add(daniel)
    funcionarios.forEach { println(it) }

    println("*".repeat(10))
    funcionarios.remove(rian)
    funcionarios.forEach { println(it) }

    println("--------SET-------")
    val funcionarioSet = mutableSetOf(rian)
    funcionarioSet.forEach { println(it) }

    println("*".repeat(10))

    funcionarioSet.add(daniel)
    funcionarioSet.add(gabriely)
    funcionarioSet.forEach { println(it) }

    println("*".repeat(10))
    funcionarioSet.remove(daniel)
    funcionarioSet.forEach { println(it) }
}