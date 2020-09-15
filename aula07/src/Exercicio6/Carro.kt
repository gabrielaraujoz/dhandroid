package Exercicio6

class Carro(var consumo: Int, var combustivelNoTanque: Int = 0) {

    fun andar(km: Int) {
        combustivelNoTanque -= km/consumo
        println("Você andou $km km e consumiu ${km/consumo} litros.")
    }

    fun adicionarGasolina(litros: Int) {
        combustivelNoTanque += litros
        println("Você abasteceu $litros litros.")
    }

    fun obterGasolina() {
        println("Você ainda tem $combustivelNoTanque litros no tanque!")
    }
}