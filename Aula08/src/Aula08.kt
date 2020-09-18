fun main() {
    var quadrado = Quadrado(4)

    quadrado.calcularArea()

    var triangulo = Triangulo(3, 5)

    triangulo.calcularArea()

    println("A área do quadrado é ${quadrado.calcularArea()} e a área do triângulo é ${triangulo.calcularArea()}")
}