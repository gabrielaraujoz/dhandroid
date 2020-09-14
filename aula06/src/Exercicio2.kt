

fun main() {
    val alturas = arrayListOf<Float>()

    for (i in 1..5) {
        print("Digite a altura $i: ")
        var altura = readLine()!!.toFloat()
        alturas.add(altura)
    }
    alturas.reverse()
    print(alturas)
}