package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testeObjects() {
    val cliente = Cliente(
        nome = "Gui",
        cpf = "000.00.000-11",
        senha = 123456
    )

    val fran = object : Autenticavel {
        var nome: String = "Tarcio"
        var cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha

    }

    println("nome da fran: ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 100)

    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)

    println("Total de contas c. object: ${Conta.total}")
}
