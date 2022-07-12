class Pessoa {
    var nome: String = "Rian"
    var idade:Int = 20
    private set

    constructor()

    fun pessoaInfo() = "$nome tem $idade anos"
}

fun main(){
    val rian = Pessoa()
    println(rian.pessoaInfo())
}