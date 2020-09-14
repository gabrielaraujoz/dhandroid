package Exercicio1

fun main() {
    var clienteUm = Cliente("Gabriel", "Araujo")
    var clienteDois = Cliente("Felipe", "Medeiros")
    var contaUm = Conta(1, 1000.00, clienteUm)
    var contaDois = Conta(2, 900.00, clienteDois)

    contaUm.deposito(100.00)
    contaUm.saque(200.00)
    contaDois.deposito(1.00)
    contaDois.saque(1000.00)
}