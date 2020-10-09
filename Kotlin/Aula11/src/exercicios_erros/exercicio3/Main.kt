package exercicios_erros.exercicio3

import java.lang.ArithmeticException

fun main() {
    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    } catch(ex: ArithmeticException) {
        println(ex.message)
    }
}