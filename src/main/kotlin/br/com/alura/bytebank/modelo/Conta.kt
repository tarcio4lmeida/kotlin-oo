package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("criando conta")
        total++
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }
        this.saldo -= valor
        destino.deposita(valor)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}