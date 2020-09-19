package exercicio2

class Item (val numero: Int, val descricao: String, var quantidade: Int, var preco: Double){

    init {
        quantidade = Math.max(0, quantidade)
        preco = Math.max(0.0, preco)
    }
}