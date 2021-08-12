fun testaAutenticacao() {
    val diretora = Diretor(
        nome = "TArcio",
        cpf = "444.444.444-44",
        salario = 200.0,
        senha = 2000,
        plr = 2000.0
    )

    val gerente = Gerente(
        nome = "Thalicia",
        cpf = "555.555.555-55",
        salario = 200.0,
        senha = 2000
    )

    val sistema = SistemaInterno()
    sistema.entra(admin = gerente, senha = 2000)
    sistema.entra(admin = diretora, senha = 1000)
}
