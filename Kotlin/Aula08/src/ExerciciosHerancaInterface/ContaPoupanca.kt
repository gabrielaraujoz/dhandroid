package ExerciciosHerancaInterface

class ContaPoupanca(val limiteCredito: Double, conta: Int, saldo: Double): ContaBancaria(conta, saldo) {
    override fun sacar(valor: Double): Boolean {
        if (valor > (saldo + limiteCredito)) {
            println("Saldo insuficiente para saque.")
            return false
        } else {
            saldo -= valor
            return true
        }

    }

    override fun depositar(valor: Double): Boolean {
        saldo += valor
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite de crédito: R$ $limiteCredito")
    }


}