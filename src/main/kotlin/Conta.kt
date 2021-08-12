abstract class Conta(
    val titular: String,
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