package Exercicio1

class Conta (numeroConta: Int, var saldo: Double, titular: Cliente) {

    fun deposito(quantia: Double) {
        saldo += quantia
        println("Você depositou $quantia na conta e o novo saldo é de $saldo")
    }

    fun saque(quantia: Double) {
        if (quantia > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= quantia
            println("Você sacou $quantia da conta, seu novo saldo é $saldo.")
        }
    }

}