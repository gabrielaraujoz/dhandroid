package `Exercicio 3`

class Prova (var dificuldade: Int, var energiaNecessaria: Int) {
    fun realizarProva(atleta: Atleta) {
        var realizacao = atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
        println(realizacao)
        if (realizacao) {
            atleta.energia -= energiaNecessaria
            println("Energia restante: ${atleta.energia}")
        } else {
            println("$atleta não tem energia suficiente para realizar a prova")
        }
    }
}