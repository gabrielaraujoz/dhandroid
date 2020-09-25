package exercicios.exercicio1

fun main() {
    val loteria = mutableMapOf<Int, String> (0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo")




    val apelidos = mutableMapOf<String, List<String>>("João" to listOf("Juan", "Fissura", "Maromba"),
                                                    "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
                                                    "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
                                                    "Lucas" to listOf("Lukinha", "Jorge", "George"))

    loteria.forEach {
        println(it.value)
    }

    apelidos.forEach {
        println(it.key)
        println(it.value)
    }

}