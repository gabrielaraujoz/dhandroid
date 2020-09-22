fun main() {
    println("Digite o sexo da pessoa:")
    var sexo = readLine()!!.toLowerCase()
    if (sexo.equals("m")) {
        println("Masculino")
    } else if (sexo.equals("f")) {
        println("Feminino")
    } else {
        println("Sexo inválido")
    }
}