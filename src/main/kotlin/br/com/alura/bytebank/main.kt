import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    println(enderecoNulo?.logradouro?.length)

    enderecoNulo = null
    enderecoNulo?.let {
        endereco : Endereco -> println(endereco.logradouro.length)
    }
}




