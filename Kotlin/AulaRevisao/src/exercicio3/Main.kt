package exercicio3

fun main() {

    // normal

    var produto = Estoque("Arroz", 100, 10)

    produto.mudarNome("Batata")
    produto.mudarQtdMinima(15)
    produto.repor(25)
    produto.darBaixa(100)
    println(produto.mostra())
    produto.precisaRepor()


//  ---> Aqui são testes realizados antes de utilizar a tratativa de throw Exception()
//
//
//
//    // qtdAtual e qtdMinima não podem ser negativos
//
//    var produto2 = Estoque("Feijão", 10, -2)
//    var produto3 = Estoque("Limão", -15, 3)
//
//    println(produto2.mostra())
//    println(produto3.mostra())
//
//    // tentando modificar as quantidades para valores menores que zero
//
//    var produto4 = Estoque("Mamão", 20, 10)
//    var produto5 = Estoque("Pêra", 5, 1)
//
//    produto4.mudarQtdMinima(-1)
//    println(produto4.mostra())
//    produto5.darBaixa(6)
//    println(produto5.mostra())
}