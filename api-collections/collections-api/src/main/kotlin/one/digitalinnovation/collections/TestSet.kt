package one.digitalinnovation.collections

fun main(){
    val rian = Funcionario("Rian", 1500.0, "CLT")
    val gabriely = Funcionario ("Gabriely", 3000.0, "PJ")
    val daniel = Funcionario ("Daniel", 2500.0, "PJ")

    val funcionarios1 = setOf(rian, gabriely)
    val funcionarios2 = setOf(daniel)

    //unir resultados
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }
    println("*".repeat(10))

    //remove algum resultado
    val funcionarios3 = setOf(rian, gabriely, daniel)
    val resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach { println(it) }
    println("*".repeat(10))

    //mostra resultados iguais entre eles
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}