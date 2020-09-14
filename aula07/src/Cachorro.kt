class Cachorro (val nome: String) {
    var cor: String = ""
    var idade: Int = 0

    constructor(nomeDoCachorro: String, idade: Int): this(nomeDoCachorro) {
        this.idade = idade
    }
}