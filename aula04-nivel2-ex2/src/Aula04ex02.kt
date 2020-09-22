fun main() {
    println("Olá, pode me informar qual é o seu ganho por hora?")
    var ganhoPorHora = readLine()!!.toInt()
    println("Quantas horas você trabalhou esse mês?")
    var horasTrabalhadas = readLine()!!.toInt()
    var salarioBruto = ganhoPorHora * horasTrabalhadas
    var descontoIR = salarioBruto * 0.11
    var descontoINSS = salarioBruto * 0.08
    var descontoSindicato = salarioBruto * 0.05
    var salarioLiquido = salarioBruto - descontoINSS - descontoIR - descontoSindicato
    println("+ Salário Bruto : R$ $salarioBruto")
    println("- IR (11%) : R$ $descontoIR")
    println("- INSS (8%) : R$ $descontoINSS")
    println("- Sindicato (5%) : R$ $descontoSindicato")
    println("= Salário Líquido : R$ $salarioLiquido")
}
