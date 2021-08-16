import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero x $numeroX")
    println("numero y $numeroY")

    val joao = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)
    val maria = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)

    val contaJoao = ContaCorrente(joao, 300)

    var contaMaria = ContaPoupanca(maria, 600)

    println("titular conta joao : ${contaJoao.titular}")
    println("titular conta Maria : ${contaMaria.titular}")
}