data class Time (val nome: String,
            val quantidadePessoas: Int) {
//se colocamos o tipo "data" na classe, ele substitui as funções equals, hashCode e toString!

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Time
//
//        if (nome != other.nome) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        return nome.hashCode()
//    }
//
//    override fun toString(): String {
//        return "Time(nome='$nome', quantidadePessoas=$quantidadePessoas)"
//    }


}