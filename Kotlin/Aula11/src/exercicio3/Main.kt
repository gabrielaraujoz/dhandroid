package exercicio3

fun main() {
    val listaDeAlunos = ArrayList<Aluno>()
    val aluno1 = Aluno("Gabriel", 1)
    val aluno2 = Aluno("Nykolle",2 )
    val aluno3 = Aluno("Sophie", 3)
    val aluno4 = Aluno("Misha", 4)
    listaDeAlunos.add(aluno1)
    listaDeAlunos.add(aluno2)
    listaDeAlunos.add(aluno3)
    listaDeAlunos.add(aluno4)
    val alunoTeste = Aluno("Manuel", 4)

    println(listaDeAlunos.contains(alunoTeste))
}