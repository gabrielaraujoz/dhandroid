package exercicio1

class Curso (val nome: String, var professor: Professor) {
    val aulas get() = ArrayList<Aula>()
    val alunos get() = ArrayList<Aluno>()
}