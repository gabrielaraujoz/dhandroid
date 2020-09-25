package exercicios.exercicio4

fun main() {
    var guardaVolume = GuardaVolumes(mutableMapOf<Int, List<Pertence>>(), 0)

    val peca1 = Pertence("Armani", "Camiseta")
    val peca2 = Pertence("Boss", "Calça")
    val listaDePecas = mutableListOf<Pertence>(peca1, peca2)

    guardaVolume.guardarpecas(listaDePecas)

    guardaVolume.mostrarPecas()

    guardaVolume.mostrarPecas(0)

    guardaVolume.devolverPecas(0)

    guardaVolume.mostrarPecas()
}