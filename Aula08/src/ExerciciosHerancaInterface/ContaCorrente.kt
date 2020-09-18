package ExerciciosHerancaInterface

class ContaCorrente(private val taxaDeOperacao: Double, conta: Int, saldo: Double): ContaBancaria(conta, saldo) {
    override fun sacar(valor: Double): Boolean {
        if (valor + taxaDeOperacao < saldo) {
            saldo -= (valor + taxaDeOperacao)
            return true
        } else {
            println("Não há saldo suficiente na conta.")
            return false
        }
    }

    override fun depositar(valor: Double): Boolean {
        if (valor > (saldo + taxaDeOperacao)) {
        saldo += (valor - taxaDeOperacao)
            return true
        } else {
            println("Você precisa depositar mais de R$ $taxaDeOperacao para não ficar com saldo negativo!")
            return false
        }

    }


    override fun mostrarDados() {
        super.mostrarDados()
        println(taxaDeOperacao)
    }

    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        TODO("Not yet implemented")
    }
}