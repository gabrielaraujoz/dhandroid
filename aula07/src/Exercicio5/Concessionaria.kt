package Exercicio5

class Concessionaria () {

    fun registrarVenda( cliente: Cliente, veiculo: Veiculo, valor: Double) {
        var venda = arrayListOf<Any>(cliente.nomeCompleto, veiculo.modelo, valor)
        println("Venda do veículo ${veiculo.marca} ${veiculo.modelo} realizada para o cliente ${cliente.nomeCompleto} por R$ $valor registrada no sistema.")
        println(venda)
    }
}