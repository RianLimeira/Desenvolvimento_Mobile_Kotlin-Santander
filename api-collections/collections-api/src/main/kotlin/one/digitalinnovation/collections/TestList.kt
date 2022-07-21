package one.digitalinnovation.collections

fun main(){
    val rian = Funcionario("Rian", 1500.0, "CLT")
    val gabriely = Funcionario ("Gabriely", 3000.0, "PJ")
    val daniel = Funcionario ("Daniel", 2500.0, "PJ")

    val funcionarios = listOf(rian, gabriely, daniel)

    funcionarios.forEach{ println(it) }
    println("*".repeat(10))
    println(funcionarios.find { it.nome == "Gabriely" })
    println("*".repeat(10))

    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("*".repeat(10))

    funcionarios.groupBy { it.tipoContatacao }.forEach { println(it) }
    println("*".repeat(10))

}