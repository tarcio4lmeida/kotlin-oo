import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("nome ${alex.cpf}")
    println("nome ${alex.salario}")

    println("bonficação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("nome ${fran.cpf}")
    println("nome ${fran.salario}")

    println("bonficação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Conectado com sucesso!")
    } else {
        println("Sem conexao")
    }

    val gui = Diretor(
        nome = "gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")

    println("bonficação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    val maria = Analista(
        nome = "maria",
        cpf = "444.444.444-44",
        salario = 4000.0
    )
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("bonficação ${maria.bonificacao}")


    val calculadora = CalculadoraBonificacao()

    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)


    println("calculadora: ${calculadora.total}")
}
