package exercicio1

class Aluno (registro: String, nome: String, val sobrenome: String): Pessoa(nome, registro) {

    override val podeAssistirAula: Boolean
        get() = true

    override val FazerLicaoDeCasa: Boolean
        get() = true

}