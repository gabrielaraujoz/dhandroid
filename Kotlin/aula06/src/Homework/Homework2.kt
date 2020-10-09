package Homework

fun main() {
    print("Digite a primeira palavra: ")
    var palavraUm = readLine()!!.toString()
    print("Digite a segunda palavra: ")
    var palavraDois = readLine()!!.toString()

    print(palavraUm != palavraDois)
}