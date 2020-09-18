class Quadrado(val comprimento: Int): Forma() {
    override val lado = 4

    override fun calcularArea(): Int {
        return comprimento * comprimento
    }
}