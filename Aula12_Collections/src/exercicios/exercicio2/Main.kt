package exercicios.exercicio2

fun main() {
    val lista1 = mutableListOf<Int>()

    lista1.add(1)
    lista1.add(5)
    lista1.add(5)
    lista1.add(6)
    lista1.add(7)
    lista1.add(8)
    lista1.add(8)
    lista1.add(8)

    println(lista1)

    val lista2 = mutableSetOf<Int>()

    lista2.add(1)
    lista2.add(5)
    lista2.add(5)
    lista2.add(6)
    lista2.add(7)
    lista2.add(8)
    lista2.add(8)
    lista2.add(8)

    println(lista2)

    // com o Set, não foram adicionados números repetidos

    lista1.forEach {
        println(it)
    }

    println()

    lista2.forEach {
        println(it)
    }
}