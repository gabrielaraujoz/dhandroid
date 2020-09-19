package exercicio3

class Estoque (var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    init {
        qtdAtual = Math.max(0, qtdAtual)
        qtdMinima = Math.max(0, qtdMinima)
    }

    fun mudarNome(novoNome: String) {
        nome = novoNome
        println("Nome mudado para $nome")
    }

    fun mudarQtdMinima(novaQtdMinima: Int) {
        if (novaQtdMinima < 0) {
            throw Exception("Quantidade não pode ser negativa")
        } else {
        qtdMinima = novaQtdMinima
        println("Nova quantidade mínima alterada para $qtdMinima")
        }
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
        println("O novo estoque é de $qtdAtual")
    }

    fun darBaixa(qtd: Int) {
        if (qtd > qtdAtual) {
            println("Não temos essa quantidade em estoque")
            throw Exception("Não temos essa quantidade no estoque, erro ao dar baixa.")
        } else {
            qtdAtual-= qtd
        }
    }

    fun mostra(): String {
        return "O nome do produto é $nome, sua quantidade mínima é $qtdMinima e a quantidade atual é $qtdAtual"
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }
}