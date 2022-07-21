package one.digitalinnovation.collections

fun main(){
    val rian = Funcionario("Rian", 1500.0, "CLT")
    val gabriely = Funcionario ("Gabriely", 3000.0, "PJ")
    val daniel = Funcionario ("Daniel", 2500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(rian.nome, rian)
    repositorio.create(gabriely.nome, gabriely)
    repositorio.create(daniel.nome, daniel)

    println(repositorio.findById(rian.nome))
    println("*".repeat(10))

    repositorio.findAll().forEach{ println(it) }
    println("*".repeat(10))

    repositorio.remove(daniel.nome)
    repositorio.findAll().forEach{ println(it) }

}