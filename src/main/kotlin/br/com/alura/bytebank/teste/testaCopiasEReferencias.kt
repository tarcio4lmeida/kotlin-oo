import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero x $numeroX")
    println("numero y $numeroY")

    val contaJoao = ContaCorrente("joao", 300)

    var contaMaria = ContaPoupanca("maria", 600)

    println("titular conta joao : ${contaJoao.titular}")
    println("titular conta Maria : ${contaMaria.titular}")
}