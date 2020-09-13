fun main() {
    var numero = 0

    print("Olá! Vamos calcular a tabuada de qual número? ")
    numero = readLine()!!.toInt()

    for (i in 1..10){
        println("$numero X $i = " + numero*i)
    }
}