package exercicio2

class Fatura {
    var listaDeItens = ArrayList<Item>()

    fun getTotalFatura(): Double {
        var total: Double = 0.00
        listaDeItens.forEach{
            it.quantidade.toDouble()
            total += (it.quantidade * it.preco)
        }
        println("O valor total da fatura é de R$ $total")
        return total
    }
}