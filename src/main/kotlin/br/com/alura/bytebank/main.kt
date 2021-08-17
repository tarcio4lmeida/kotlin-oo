import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Bem vindo ao Bytebank")
    val endereco = Endereco(logradouro = "Rua vergueiro")
    val enderecoNovo = Endereco(logradouro="Rua vergueiro")

    println(endereco)
    println(enderecoNovo)

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
}



