package exercicios_erros.exercicio3

class CalculoMatematico() {
    fun divisao (numero1: Int, numero2: Int): Int {

        if (numero2 == 0) {
            throw ArithmeticException("Não pode dividir por zero")
        } else {
//        try {
            return numero1 / numero2
        }

//        } catch(ex: ArithmeticException) {
//            println("A operação não pode ser realizada")
//            return 0
//        }

    }
}