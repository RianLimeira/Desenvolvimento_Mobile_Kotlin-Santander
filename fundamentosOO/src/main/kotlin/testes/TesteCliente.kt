package testes

import Cliente
import ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.789-11",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}