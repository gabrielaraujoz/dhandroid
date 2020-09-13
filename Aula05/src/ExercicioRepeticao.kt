fun main() {
    var numero = 0.0
    var soma = 0.0
    var quantidadeNotas = 0
    var media = 0.0

    println("Quantas notas você quer inserir no programa?")
    quantidadeNotas = readLine()!!.toInt()

    for (i in 1..quantidadeNotas) {
        print("Por favor, digite a nota $i: ")
        numero = readLine()!!.toDouble()
        soma += numero
    }
    media = soma/quantidadeNotas
    println("A média das notas inseridas é: $media")
}