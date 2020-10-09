package Exercicio5

fun main() {
    var cliente = Cliente("Gabriel", "Araujo", "(11) 99999-9999")
    var veiculo = Veiculo("Mercedes-Benz", "C180", 2020, "Branco", 15000)
    var venda = Venda(cliente, veiculo, 120000.00)
    var concessionaria = Concessionaria()
    concessionaria.registrarVenda(cliente, veiculo, venda.valorVenda)
}