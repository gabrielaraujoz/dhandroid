fun main() {
    var quantidadeDeCDS = 0
    var valorInvestido = 0.0

    println("Olá! Vamos calcular o custo médio da sua coleção de CDs! Para começarmos, quantos CDs você possui?")
    quantidadeDeCDS = readLine()!!.toInt()
    println("òtimo, vamos agora inserir os preços de cada um dos $quantidadeDeCDS CDs, ok?")
    for (i in 1..quantidadeDeCDS) {
        println("Qual foi o preço do CD $i?")
        valorInvestido += readLine()!!.toDouble()
    }
    var media = valorInvestido/quantidadeDeCDS
    print("Legal! Sua coleção possui $quantidadeDeCDS CDs e você investiu um total de R$ $valorInvestido, resultando em um custo médio de R$ $media!")
}