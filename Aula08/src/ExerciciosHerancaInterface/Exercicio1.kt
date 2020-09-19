package ExerciciosHerancaInterface

fun main() {
//

    val banco = Banco()

    menuPrincipal(banco)

}


fun menuPrincipal(banco: Banco) {
    do {
        var loop = true
        var loop2 = true
        var opcaoUm = 0
        println("----------------------------------------------------------------------------------------")
        println("Olá, seja bem vindo ao banco! Digite uma das opções abaixo para que possamos continuar:")
        println("1. Criar conta.")
        println("2. Selecionar conta para operações.")
        println("3. Remover conta")
        println("4. Gerar relatório do banco.")
        println("5. Finalizar")
        println("----------------------------------------------------------------------------------------")
        opcaoUm = readLine()!!.toInt()
        do { when (opcaoUm) {
            1 -> loop2 = criarConta(banco, loop2)

            2 -> loop2 = menuSecundario(loop2, banco)
            3 -> loop2 = removerConta(banco, loop2)
            4 -> {
                banco.mostrarDados()
                break
            }
            5 -> {
                loop = false
                break
            }
            else -> {
                println("Por favor, digite um número de 1 a 5.")
                break
            }
        }
        } while (loop2)


    } while (loop)
    println("Programa encerrado.")

}

fun menuSecundario(loop2: Boolean, banco: Banco): Boolean {
    var loop2 = loop2
    var opcao2 = ""
    print("Digite o número da conta desejada: ")
    var conta = readLine()!!.toInt()
    var contaExiste = banco.procurarConta(conta)
    if (contaExiste != null) {
        println("----------------------------------------------------------------------------------------")
        println("Você pode realizar as seguintes operações:")
        println("a. Depositar.")
        println("b. Sacar.")
        println("c. Transferir")
        println("d. Gerar Relatório.")
        println("e. Retornar ao menu anterior.")
        println("----------------------------------------------------------------------------------------")
        print("Digite a operação desejada: ")
        opcao2 = readLine()!!.toString()
        when (opcao2) {
            "a" -> {
                print("Digite o valor a ser depositado: ")
                var valor = readLine()!!.toDouble()
                contaExiste.depositar(valor)
                loop2 = true
                return loop2
            }
            "b" -> {
                print("Digite o valor a ser sacado: ")
                var valor = readLine()!!.toDouble()
                    if(contaExiste.sacar(valor)) {
                        println("Saque realizado.")
                        loop2 = true
                        return loop2
                    } else {
                        println("Não foi possível realizar o saque.")
                        loop2 = true
                        return loop2
                    }
                }
            "c" -> {
                    print("Digite o valor a ser transferido com dois dígitos decimais: ")
                    var valor = readLine()!!.toDouble()
                    print("Digite o número da conta para a qual você deseja transferir: ")
                    var contaAlvo = readLine()!!.toInt()
                    var contaAlvoExiste = banco.procurarConta(contaAlvo)
                    if (contaAlvoExiste != null) {
                        contaExiste.transferir(valor, contaAlvoExiste)
                        println("Valor transferido.")
                        loop2 = true
                        return loop2
                    } else {
                        println("Conta inexistente, por favor tente novamente")
                        loop2 = true
                        return loop2
                    }
                }
            "d" -> {
                    contaExiste.mostrarDados()
                    loop2 = true
                    return loop2
                }
            else -> {
                loop2 = false
                return loop2
            }
        }
    } else {
            println("Conta inexistente, por favor tente novamente")
            loop2 = false
            return loop2
        }
    }

fun criarConta(banco: Banco, loop2: Boolean): Boolean {
    var loop2 = loop2
    println("Qual é o tipo de conta? Digite 1 para Conta Corrente e 2 para Conta Poupança.")
    var tipoConta = readLine()!!.toInt()

    when (tipoConta) {
        1 -> {
            print("Digite a taxa de operação: ")
            var taxaConta = readLine()!!.toDouble()
            print("Digite o número da conta: ")
            var numeroConta = readLine()!!.toInt()
            print("Ótimo! Agora digite por favor o saldo inicial da conta: ")
            var saldoInicial = readLine()!!.toDouble()

            var novaConta = ContaCorrente(taxaConta, numeroConta, saldoInicial)
            banco.inserirConta(novaConta)
            println("Conta criada com sucesso!")
            loop2 = false
            return loop2
        }
        2 -> {
            print("Digite o limite de crédito: ")
            var limiteCredito = readLine()!!.toDouble()
            print("Digite o número da conta: ")
            var numeroConta = readLine()!!.toInt()
            print("Ótimo! Agora digite por favor o saldo inicial da conta: ")
            var saldoInicial = readLine()!!.toDouble()

            var novaConta = ContaPoupanca(limiteCredito, numeroConta, saldoInicial)
            banco.inserirConta(novaConta)
            loop2 = false
            return loop2

            }
        else -> {
            println("Por favor, digite 1 ou 2 para criar a conta. Voltando ao menu..")
            loop2 = false
            return loop2
            }
    }
}

fun removerConta(banco: Banco, loop2: Boolean): Boolean {
    var loop2 = loop2
    print("Informe o número da conta a ser removida: ")
    var numeroConta = readLine()!!.toInt()
    var contaExiste = banco.procurarConta(numeroConta)
    if (contaExiste == null) {
        println("Essa conta não existe. Por favor tente novamente.")
        loop2 = false
        return loop2
    } else {
        banco.removerConta(contaExiste)
        println("Conta removida com sucesso!")
        loop2 = false
        return loop2
    }
}

//      Testes iniciais pré implementação do banco

//    val contaCorrente = ContaCorrente(5.00,1, 10.00)
//    val contaPoupanca = ContaPoupanca(200.00, 2, 250.00)
//
//    contaCorrente.depositar(100.00)
//    contaCorrente.sacar(50.00)
//    contaPoupanca.depositar(20.00)
//    contaPoupanca.sacar(350.00)
//
//    val relatorio = Relatorio()
//
//    relatorio.gerarRelatorio(contaCorrente)
//    relatorio.gerarRelatorio(contaPoupanca)


//    do {
//        var loop = true
//        var loop2 = true
//        var opcaoUm = 0
//        println("----------------------------------------------------------------------------------------")
//        println("Olá, seja bem vindo ao banco! Digite uma das opções abaixo para que possamos continuar:")
//        println("1. Criar conta.")
//        println("2. Selecionar conta para operações.")
//        println("3. Remover conta")
//        println("4. Gerar relatório do banco.")
//        println("5. Finalizar")
//        println("----------------------------------------------------------------------------------------")
//        opcaoUm = readLine()!!.toInt()
//        do { when (opcaoUm) {
//                1 -> {
//                    println("Qual é o tipo de conta? Digite 1 para Conta Corrente e 2 para Conta Poupança.")
//                    var tipoConta = readLine()!!.toInt()
//
//                    when (tipoConta) {
//                        1 -> {
//                            print("Digite a taxa de operação com dois números decimais:")
//                            var taxaConta = readLine()!!.toDouble()
//                            print("Digite o número da conta: ")
//                            var numeroConta = readLine()!!.toInt()
//                            print("Ótimo! Agora digite por favor o saldo inicial da conta com dois números decimais: ")
//                            var saldoInicial = readLine()!!.toDouble()
//
//                            var novaConta = ContaCorrente(taxaConta, numeroConta, saldoInicial)
//                            banco.inserirConta(novaConta)
//                            println("Conta criada com sucesso!")
//                            loop2 = false
//                        }
//                        2 -> {
//                            print("Digite o limite de crédito com dois números decimais:")
//                            var limiteCredito = readLine()!!.toDouble()
//                            print("Digite o número da conta: ")
//                            var numeroConta = readLine()!!.toInt()
//                            print("Ótimo! Agora digite por favor o saldo inicial da conta com dois números decimais: ")
//                            var saldoInicial = readLine()!!.toDouble()
//
//                            var novaConta = ContaPoupanca(limiteCredito, numeroConta, saldoInicial)
//                            banco.inserirConta(novaConta)
//                            loop2 = false
//                        }
//                        else -> {
//                            println("Por favor, digite 1 ou 2 para criar a conta. Voltando ao menu..")
//                            loop2 = false
//                        }
//                    }
//                    }
//                2 -> {
//                    var opcao2 = ""
//                    print("Digite o número da conta desejada: ")
//                    var conta = readLine()!!.toInt()
//                    var contaExiste = banco.procurarConta(conta)
//                    if (contaExiste == null) {
//                        println("Conta inexistente, por favor tente novamente")
//                        break
//                    }
//                    println("----------------------------------------------------------------------------------------")
//                    println("Você pode realizar as seguintes operações:")
//                    println("a. Depositar.")
//                    println("b. Sacar.")
//                    println("c. Transferir")
//                    println("d. Gerar Relatório.")
//                    println("e. Retornar ao menu anterior.")
//                    println("----------------------------------------------------------------------------------------")
//                    print("Digite a operação desejada: ")
//                    opcao2 = readLine()!!.toString()
//                    if (opcao2 == "a") {
//                        print("Digite o valor a ser depositado com dois dígitos decimais: ")
//                        var valor = readLine()!!.toDouble()
//                        contaExiste.depositar(valor)
//                        loop2 = false
//                    } else if (opcao2 == "b") {
//                        print("Digite o valor a ser sacado com dois dígitos decimais: ")
//                        var valor = readLine()!!.toDouble()
//                        if(contaExiste.sacar(valor)) {
//                            println("Saque realizado.")
//                            loop2 = false
//                        } else {
//                            println("Não foi possível realizar o saque.")
//                            loop2 = false
//                        }
//                    } else if (opcao2 == "c") {
//                        print("Digite o valor a ser transferido com dois dígitos decimais: ")
//                        var valor = readLine()!!.toDouble()
//                        print("Digite o número da conta para a qual você deseja transferir: ")
//                        var contaAlvo = readLine()!!.toInt()
//                        var contaAlvoExiste = banco.procurarConta(contaAlvo)
//                        if (contaAlvoExiste == null){
//                            println("Conta inexistente, por favor tente novamente")
//                            break
//                        }
//                        contaExiste.transferir(valor, contaAlvoExiste)
//                        println("Valor transferido.")
//                    } else if (opcao2 == "d") {
//                        contaExiste.mostrarDados()
//                        loop2 = false
//                    } else {
//                        break
//                    }
//                }
//                3 -> {
//                    print("Informe o número da conta a ser removida: ")
//                    var numeroConta = readLine()!!.toInt()
//                    var contaExiste = banco.procurarConta(numeroConta)
//                    if (contaExiste == null) {
//                        println("Essa conta não existe. Por favor tente novamente.")
//                        break
//                    } else {
//                        banco.removerConta(contaExiste)
//                        println("Conta removida com sucesso!")
//                        loop2 = false
//                    }
//                }
//                4 -> {
//                    banco.mostrarDados()
//                    break
//                }
//                5 -> loop = false
//                else -> {
//                    println("Por favor, digite um número de 1 a 5.")
//                    break
//                }
//            }
//        } while (loop2 == true)
//
//
//    } while (loop == true)