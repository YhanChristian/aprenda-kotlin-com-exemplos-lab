data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.addAll(listOf(usuario))
        for(inscrito in inscritos) {
            println("Seja bem-vindo ${usuario.nome} com ${usuario.idade} anos")
        }
    }
}