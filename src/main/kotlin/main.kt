fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.deposita(200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
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
    if(contaFran.transfere(contaAlex, 100.0)){
        println("Transferência sucedida")
        println(contaAlex.saldo)
        println(contaFran.saldo)
    }else{
        println("Falha na transferência")
    }


}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(destino: Conta, valor: Double) : Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
       return false
    }
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