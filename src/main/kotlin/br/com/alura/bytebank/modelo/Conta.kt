package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
    ) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double) : Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
       return false
    }
}