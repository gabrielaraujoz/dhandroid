fun main() {
    val notaAprovacao = 7
    val notaDistincao = 10.0
    println("Olá, digite a sua primeira nota:")
    var notaUm = readLine()!!.toDouble()
    println("Obrigado! Agora digite a sua segunda nota, por favor:")
    var notaDois = readLine()!!.toDouble()
    var media = (notaUm + notaDois)/2

    if (media == notaDistincao) {
        println("Aprovado com Distinção")
    } else if (media < notaAprovacao) {
        println("Reprovado")
    } else {
        println("Aprovado")
    }

}