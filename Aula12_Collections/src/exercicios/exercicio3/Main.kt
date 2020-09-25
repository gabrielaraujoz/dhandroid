package exercicios.exercicio3

fun main() {
    val prova = Prova()

    val inteiros = mutableSetOf<Int>(1,2,4,7,8,55,10,3)

    inteiros.forEach {
        println(it)
    }

    prova.somaTotal(inteiros)
}