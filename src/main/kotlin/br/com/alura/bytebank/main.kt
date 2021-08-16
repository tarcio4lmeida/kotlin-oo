import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {
    println("Bem vindo ao Bytebank")

    val cliente = Cliente(
        nome = "Gui",
        cpf= "000.00.000-11",
        senha = 123456
    )
    val sistema = SistemaInterno()
    sistema.entra(admin = cliente, senha = 123456)
}




