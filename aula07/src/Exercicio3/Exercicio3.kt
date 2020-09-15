package `Exercicio 3`

fun main() {
    var atletaUm = Atleta("Gabriel", 10,50)
    var atletaDois = Atleta("Felipe", 20, 100)
    var provaUm = Prova(5,10)
    var provaDois = Prova(9, 30)
    var provaTres = Prova(15, 50)

    provaUm.realizarProva(atletaUm)
    provaDois.realizarProva(atletaUm)
    provaTres.realizarProva(atletaUm)
    provaUm.realizarProva(atletaDois)
    provaDois.realizarProva(atletaDois)
    provaTres.realizarProva(atletaDois)
}