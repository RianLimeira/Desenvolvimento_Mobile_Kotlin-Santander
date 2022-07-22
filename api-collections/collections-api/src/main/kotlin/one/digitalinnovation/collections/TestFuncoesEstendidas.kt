package one.digitalinnovation.collections

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "3000".toBigDecimal()
    )
    
    println("*".repeat(15))
    println(salarios.somatoria())
    println("*".repeat(15))
    println(salarios.media())
}