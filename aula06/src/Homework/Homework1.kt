package Homework

fun main() {
    val numeros = arrayListOf<Int>()

    for (i in 1..3) {
        print("Digite o número $i: ")
        numeros.add(readLine()!!.toInt())
    }
    println(numeros.maxOrNull())
}