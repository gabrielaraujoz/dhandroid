const val PERGUNTA2 = "Digite um número: "

fun main() {
    var numeros = arrayListOf<Int>()

    for (i in 1..10) {
        print(PERGUNTA2)
        var numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    numeros.reverse()
    print(numeros)

}