package ExerciciosHerancaInterface

abstract class ContaBancaria (protected val conta: Int, protected var saldo: Double): Imprimivel {
    abstract fun sacar(valor: Double): Boolean
    abstract fun depositar(valor: Double): Boolean
    override fun mostrarDados() {
        println("Número da conta: $conta")
        println("Saldo da conta: R$ $saldo")
    }
    open fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        if (sacar(valor)) {
            sacar(valor)
            if (contaBancaria.depositar(valor)){
                contaBancaria.depositar(valor)
        println("Transferência realizada.")
        }
        }
        else {
            println("Não foi possível realizar a transferência")
        }
    }
}