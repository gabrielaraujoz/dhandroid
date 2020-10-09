package ExerciciosHerancaInterface

class Banco(): Imprimivel {
    val contas = ArrayList<ContaBancaria>()


    fun inserirConta(conta: ContaBancaria) {
        contas.add(conta)
    }
    fun removerConta(conta: ContaBancaria) {
        contas.remove(conta)
    }
    fun procurarConta(conta: Int): ContaBancaria? {
        if (conta <= contas.size) {
            return contas.get(conta-1)
        }
        return null
    }

    override fun mostrarDados() {
        contas.forEach{
            it.mostrarDados()
            println()
        }

    }
}