// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (var nomeUsuario: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        
        inscritos.add(usuario)
    }
    
    fun descreveMatricula() {
        for (usuario in inscritos) {
            println("O usuário ${usuario.nomeUsuario} se matriculou na formação ${this.nome} de nível ${this.nivel}")
        }
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Kotlin")
    val conteudo2 = ConteudoEducacional("Android")
    
    val conteudos = listOf(conteudo1, conteudo2)
    
    val formacao = Formacao("Desenvlvimento Mobile", conteudos, Nivel.DIFICIL)
    
    val usuario = Usuario("Leandro Linhares")
    formacao.matricular(usuario)
    
    formacao.descreveMatricula()
}
