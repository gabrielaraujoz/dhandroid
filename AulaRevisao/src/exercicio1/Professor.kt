package exercicio1

abstract class Professor (registro: String, nome: String): Pessoa(nome, registro) {

    override val podeDarAula: Boolean
        get() = true

    override val podeFazerChamada: Boolean
        get() = true

}