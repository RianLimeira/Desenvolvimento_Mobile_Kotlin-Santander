package testes

import Analista
import Funcionario
import Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Analista("Joao", "12345678955", 6000.0)
    imprimeRelatorioFuncionario.imprime(joao)
}