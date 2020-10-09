val PERGUNTA = "Digite o número desejado: "

fun main() {
    var numeros = arrayListOf<Int>()

    for (i in 1..5) {
        print(PERGUNTA)
        var numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    print(numeros)
}