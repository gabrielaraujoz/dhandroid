package exercicios.exercicio4

class GuardaVolumes(val dicionario: MutableMap<Int, List<Pertence>> = mutableMapOf(), var contador: Int ) {

    fun guardarpecas (listaDePeca: MutableList<Pertence>) {
        contador = dicionario.size
        dicionario[contador] = listaDePeca
        println("As peças foram adicionadas com sucesso com o código: $contador.")

    }


    fun mostrarPecas() {
        if (dicionario.size == 0) {
            println("O guarda-volumes está vazio.")
        } else{
        println(dicionario)
        }
    }

    fun mostrarPecas(numero: Int) {
        dicionario.forEach {
            if (it.key == numero) {
                println(it.key)
                println(it.value.toString())
            }
        }
    }

    fun devolverPecas(numero: Int) {
        dicionario.remove(numero)
        println("As peças guardadas com o código \"$numero\" foram removidas")

    }
}