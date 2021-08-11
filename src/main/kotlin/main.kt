fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero x $numeroX")
    println("numero y $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "joao"
    var contaMaria = Conta()
    contaMaria.titular = "maria"

    println("titular conta joao : ${contaJoao.titular}")
    println("titular conta Maria : ${contaMaria.titular}")

}

fun testaLacos() {
    for (i in 5 downTo 1 step 2) {
        if (i == 4) {
            break;
        }

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i
        saldo = 100 + 2.0
        saldo += 200

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")

        println()


    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}