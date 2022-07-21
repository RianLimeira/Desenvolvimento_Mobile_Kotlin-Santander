package one.digitalinnovation.collections
import kotlin.math.*


fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)
    for (salario in salarios) {
        println(salario)
    }

    println("*".repeat(10))
    println("Numero de salarios: " + salarios.count())
    println("Maior salario: ${salarios.maxOrNull()}")
    //println(max(max(salarios[0], salarios[1]), salarios[2]))
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    //filtro
    val salariosMaior2500 = salarios.filter { it > 2000.0 }
    println("*".repeat(10))
    salariosMaior2500.forEach{ println(it) }
    println("*".repeat(10))

    //contador
    println(salarios.count({it in 2000.0 .. 5000.0}))
    println("*".repeat(10))

    //busca pelo valor (exemplo uma conta de banco), retorna valor or null
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 50.0 })
    println("*".repeat(10))

    //busca qualquer valor valido, retorna true/false
    println(salarios.any({it == 1000.0}))
    println(salarios.any({it == 50.0}))
}
