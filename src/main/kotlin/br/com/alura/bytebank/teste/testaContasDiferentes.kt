import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo c. corrente : ${contaCorrente.saldo}")
    println("saldo c. poupanca : ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo c. corrente : ${contaCorrente.saldo}")
    println("saldo c. poupanca : ${contaPoupanca.saldo}")

    contaCorrente.transfere(contaPoupanca, 100.0)

    println("saldo c. corrente após transferir : ${contaCorrente.saldo}")
    println("saldo c. poupanca após transferir: ${contaPoupanca.saldo}")
}
