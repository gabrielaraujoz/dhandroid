package Exercicio2

class SessaoDeTreinamento (var experiencia: Int) {
    fun treinarA(jogador: JogadorDeFutebol) {
        println("Experiência inicial: ${jogador.experiencia}")
        jogador.correr(jogador)
        jogador.fazerGol(jogador)
        jogador.correr(jogador)
        jogador.experiencia++
        println("Experiência final: ${jogador.experiencia}")
    }
}