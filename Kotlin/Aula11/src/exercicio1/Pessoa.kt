package exercicio1

class Pessoa (val nome: String, val RG: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (RG != other.RG) return false

        return true
    }

    override fun hashCode(): Int {
        return RG
    }
}