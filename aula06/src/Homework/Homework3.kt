package Homework

fun main() {
    print("Digite um número: ")
    var numero = readLine()!!.toInt()
    print(numero%2 == 0)
}