package exerciciopraticomap

fun main() {

    val sp = Estado("SP", "São Paulo")
    val rj = Estado("RJ", "Rio de Janeiro")
    val es = Estado("ES", "Espírito Santo")
    val mg = Estado("MG", "Minas Gerais")
    val estados = listOf<Estado>(sp, rj, es, mg)

    val pessoa1 = Pessoa("Felipe", sp)
    val pessoa2 = Pessoa("Gabriel", sp)
    val pessoa3 = Pessoa("Nykolle", mg)
    val pessoa4 = Pessoa("Sophie", rj)
    val pessoa5 = Pessoa("Misha", es)
    val pessoa6 = Pessoa("Paulo", mg)

    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6)

    val estadosAgrupados = mutableMapOf<String, MutableList<Pessoa>>()

    pessoas.forEach{
                if(!estadosAgrupados.containsKey(it.estado.sigla)) {
                    estadosAgrupados[it.estado.sigla] = mutableListOf()
            }

        estadosAgrupados[it.estado.sigla]?.add(it)

    }

    println(estadosAgrupados)

}