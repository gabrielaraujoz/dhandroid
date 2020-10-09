package exercicio2

fun main() {
    // preço negativo
    // quantidade negativa
    var fatura = Fatura()
    var listaDeItens = fatura.listaDeItens

    var item1 = Item(1, "item teste", 100, -2.00)
    var item2 = Item(2, "item teste 2", -200, 20.00)

    listaDeItens.add(item1)
    listaDeItens.add(item2)

    fatura.getTotalFatura()

    // preço positivo
    //quantidade positva

    var fatura2 = Fatura()
    var listaDeItens2 = fatura2.listaDeItens

    item1 = Item(1, "item teste", 100, 2.00)
    item2 = Item(2, "item teste 2", 200, 20.00)

    listaDeItens2.add(item1)
    listaDeItens2.add(item2)

    fatura2.getTotalFatura()

    //preço negativo
    //quantidade positiva

    var fatura3 = Fatura()
    var listaDeItens3 = fatura3.listaDeItens

    item1 = Item(1, "item teste", 100, -2.00)
    item2 = Item(2, "item teste 2", 200, -20.00)

    listaDeItens3.add(item1)
    listaDeItens3.add(item2)

    fatura3.getTotalFatura()

    //preço positivo
    //quantidade negativa

    var fatura4 = Fatura()
    var listaDeItens4 = fatura4.listaDeItens

    item1 = Item(1, "item teste", -100, 2.00)
    item2 = Item(2, "item teste 2", -200, 20.00)

    listaDeItens4.add(item1)
    listaDeItens4.add(item2)

    fatura4.getTotalFatura()
}