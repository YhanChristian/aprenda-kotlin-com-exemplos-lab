// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)





fun main() {
    // Criando usuários
    val usuarios = listOf(
        Usuario("Ana", 25),
        Usuario("Carlos", 30),
        Usuario("Maria", 28),
        Usuario("Pedro", 35),
        Usuario("Julia", 22)
    )

    // Criando conteúdos educacionais
    val conteudos = listOf(
        ConteudoEducacional("Introdução à Programação em Kotlin", 90),
        ConteudoEducacional("Desenvolvimento de Aplicativos Android", 120),
        ConteudoEducacional("Ciência de Dados com Python", 150),
        ConteudoEducacional("Machine Learning Fundamentals", 180),
        ConteudoEducacional("Redes Neurais Artificiais", 100)
    )

    // Criando formações e matriculando usuários
    val formacoes = mutableListOf<Formacao>()
    for ((indice, conteudo) in conteudos.withIndex()) {
        val formacao = Formacao("Formação ${indice + 1}", listOf(conteudo))
        formacao.matricular(usuarios[indice])
        formacoes.add(formacao)
    }

    // Imprimindo os itens
    for (formacao in formacoes) {
        println("Formação: ${formacao.nome}")
        println("Conteúdos:")
        for (conteudo in formacao.conteudos) {
            println("- ${conteudo.nome}, Duração: ${conteudo.duracao} minutos")
        }
        println("Usuário Matriculado: ${formacao.inscritos.first().nome}, Idade: ${formacao.inscritos.first().idade}\n")
    }
}