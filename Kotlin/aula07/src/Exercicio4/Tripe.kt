package Exercicio4

class Tripe (var dobrado: Boolean, var alturaMinima: Double, var alturaMaxima: Double, var alturaAtual: Double) {
    fun definirAltura(novaAltura: Double) {
        alturaAtual = novaAltura
    }
    fun dobrar() {
        if (dobrado == true) {
            println("O tripé já está dobrado")
        } else {
            dobrado = true
            println("O tripé foi dobrado")
        }
    }
    fun desdobrar() {
        if (dobrado == false) {
            println("O tripé já está desdobrado")
        } else {
            dobrado = false
            println("O tripé foi desdobrado")
        }
    }
    fun guardar() {
        dobrado = true
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar() {
        if(dobrado == true && alturaAtual == alturaMinima) {
            println("O tripé está pronto para guardar")
        } else {
            println("O tripé não está pronto para guardar, utilize a função guardar()")
        }
    }

    fun usar() {
        dobrado = false
        alturaAtual = alturaMaxima/2 + 1
    }

    fun prontoParaUsar() {
        if (dobrado == false && alturaAtual > alturaMaxima/2) {
            println("O tripé está pronto para ser usado")
        } else {
            println("O tripé não está pronto para ser usado, utilize a função usar()")
        }
    }
}