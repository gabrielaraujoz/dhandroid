package exercicio1

abstract class Pessoa(nome: String, registro: String) {
    open val podeAssistirAula: Boolean
        get() = false

    open val FazerLicaoDeCasa: Boolean
        get() = false

    open val podeDarAula: Boolean
        get() = false

    open val podeFazerChamada: Boolean
        get() = false

}