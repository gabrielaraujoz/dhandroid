package Exercicio2

class JogadorDeFutebol (var nome: String,var energia: Int,var alegria: Int,var gols: Int,var experiencia: Int) {
    fun fazerGol(jogador: JogadorDeFutebol) {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOL!")
    }
    fun correr(jogador: JogadorDeFutebol) {
        energia -= 10
        println("cansei.")
    }
}