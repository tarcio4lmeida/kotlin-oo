import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas

fun main() {
    println("Bem vindo ao Bytebank")

    val cliente = Cliente(
        nome = "Gui",
        cpf = "000.00.000-11",
        senha = 123456
    )
    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)
    testaContasDiferentes()

    println("Total de contas: ${totalContas}")
}





