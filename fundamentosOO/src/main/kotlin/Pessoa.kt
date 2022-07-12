class Pessoa {
    var nome: String = "Rian"
    var idade:Int = 20
    private set
}

fun main(){
    val rian = Pessoa()
    println(rian.nome)
    println(rian.idade)
}