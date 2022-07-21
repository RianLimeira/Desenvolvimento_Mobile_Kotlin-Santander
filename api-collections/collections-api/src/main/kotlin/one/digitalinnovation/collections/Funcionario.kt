package one.digitalinnovation.collections

data class Funcionario (
        val nome:String,
        val salario:Double,
        val tipoContatacao: String
        ){
        override fun toString(): String = """
        Nome:    $nome
        Salário: $salario
    """.trimIndent()
}
