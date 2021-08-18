import java.lang.NumberFormatException

fun testaExcessao() {
    println("Inicio main")
    val entrada = "1.9"

    try {
        val valor: Double = entrada.toDouble()
        println("Valor recebido: $valor")
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        println(e.printStackTrace())
    }
}
