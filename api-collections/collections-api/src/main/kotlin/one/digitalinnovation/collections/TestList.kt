package one.digitalinnovation.collections

fun main(){
    val rian = Funcionario("Rian", 1000.0)
    val gabriely = Funcionario ("Gabriely", 2000.0)
    val daniel = Funcionario ("Daniel", 2500.0)

    val funcionarios = listOf(rian, gabriely, daniel)

    funcionarios.forEach{ println(it)
    println("*".repeat(10))
    }
    
    println(funcionarios.find { it.nome == "gabriely" })
}

data class Funcionario(
    val nome:String,
    val salario:Double
) {
    override fun toString(): String = """
        Nome:    $nome
        Salário: $salario
    """.trimIndent()
}