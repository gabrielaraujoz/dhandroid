class Triangulo(var base: Int,var altura: Int): Forma() {
    override val lado = 3

    override fun calcularArea(): Int {
        return (base*altura /2)
    }
}