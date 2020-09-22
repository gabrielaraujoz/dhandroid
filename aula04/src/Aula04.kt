fun main() {
    println("Qual é a temperatura em Fahrenheit?")
    var temperatura = readLine()!!.toInt()
    var tempCelsius = 5*((temperatura-32)/9)
    println("A temperatura em Celsius é $tempCelsius")
}