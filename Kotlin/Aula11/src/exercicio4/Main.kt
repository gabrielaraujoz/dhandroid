package exercicio4

fun main() {
    val listaDeFuncionario = ArrayList<Funcionario>()
    val func1 = Funcionario("Gabriel", 1)
    val func2 = Funcionario("Nykolle", 2)
    val func3 = Funcionario("Sophie", 3)
    val func4 = Funcionario("Misha", 4)
    listaDeFuncionario.add(func1)
    listaDeFuncionario.add(func2)
    listaDeFuncionario.add(func3)
    listaDeFuncionario.add(func4)
    val funcTeste = Funcionario("Goku", 4)

    println(listaDeFuncionario.contains(funcTeste))

}