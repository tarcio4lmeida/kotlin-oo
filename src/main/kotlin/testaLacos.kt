fun testaLacos() {
    for (i in 5 downTo 1 step 2) {
        if (i == 4) {
            break;
        }

        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i
        saldo = 100 + 2.0
        saldo += 200

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")

        println()


    }
}
