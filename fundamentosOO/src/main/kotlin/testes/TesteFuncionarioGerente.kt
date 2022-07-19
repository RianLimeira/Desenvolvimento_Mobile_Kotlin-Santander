package testes

import Analista
import Funcionario
import Gerente
import Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Gerente("Maria Reis", "12345678955", 6000.0)
    imprimeRelatorioFuncionario.imprime(maria)
}
