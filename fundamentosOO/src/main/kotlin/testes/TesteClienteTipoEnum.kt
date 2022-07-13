package testes
import ClienteTipo
fun main(){
    // explicito
    ClienteTipo.values().forEach {
        elemento -> println("${elemento.name} - ${elemento.descricao}")
    }
    /* implicito
    ClienteTipo.values().forEach {
            println("${it.name} - ${it.descricao}")
    }*/
    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")
}