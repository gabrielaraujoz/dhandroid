package exercicios_erros.exercicio1

fun main() {
    val animais = ArrayList<String>()

    animais.add("Pato")
    animais.add("Cachorro")
    animais.add("Gato")
    try {
        println(animais[3])
    } catch (ex: Exception) {
        println(ex.message)
        ex.printStackTrace()
    }
}