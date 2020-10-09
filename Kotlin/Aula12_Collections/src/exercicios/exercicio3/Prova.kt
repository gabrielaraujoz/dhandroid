package exercicios.exercicio3

class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>) {
        var soma = 0
        conjuntoDeInteiros.forEach {
            soma += it
        }
        println(soma)
    }
}