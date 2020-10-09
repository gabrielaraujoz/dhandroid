package Exercicio2

fun main() {
    var jogadorUm = JogadorDeFutebol("Gabriel", 50, 0, 0, 0)
    var jogadorDois = JogadorDeFutebol("Felipe", 50, 10, 2, 5)
    var treinamento = SessaoDeTreinamento(1)
    treinamento.treinarA(jogadorUm)
    treinamento.treinarA(jogadorDois)
}