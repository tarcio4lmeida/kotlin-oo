fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Tranferindo para conta oa Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 100.0)) {
        println("Transferência sucedida")
        println(contaAlex.saldo)
        println(contaFran.saldo)
    } else {
        println("Falha na transferência")
    }
}
