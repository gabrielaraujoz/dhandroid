package errosteoria

fun main() {
    try {
        val numeros = listOf("um", "dois", "três")
        println(numeros.get(3))
    } catch (ex: ArrayIndexOutOfBoundsException){
        println("Deu erro")
    } catch (ex: Exception) {
        println(ex.message)
    }
    // esse caso dá para tratar com if tranquilamente!
}