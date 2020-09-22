fun main() {
    println("Digite um número, por favor:")
    var numero = readLine()!!.toInt()
    if (numero%2 == 0) {
        println("Este número é par!")
    } else {
        println("Este número é ímpar!")
    }
}