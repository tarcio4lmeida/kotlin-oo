fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero x $numeroX")
    println("numero y $numeroY")

    val contaJoao = Conta("joao", 300)

    var contaMaria = Conta("maria", 600)

    println("titular conta joao : ${contaJoao.titular}")
    println("titular conta Maria : ${contaMaria.titular}")
}