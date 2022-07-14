package testes

import Funcionario
import Pessoa
import java.math.BigDecimal

fun main(){
    val rian = Pessoa("Rian", "12345678901")
    println(rian.nome)
    println(rian.cpf)

    val joao = Funcionario("Joao", "12345678955", BigDecimal(6000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}