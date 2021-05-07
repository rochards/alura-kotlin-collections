package br.com.alura.collections.list

/* para data classe, automaticamente o compilador cria os métodos equals e hashCode, toString, copy. Caso vc crie
atributos fora do construtor, então esses não serão utilizados para compor os métodos citadas anteriormente. */
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    val editora: String? = null,
) : Comparable<Livro> { // Comparable para usar o método sorted
    override fun compareTo(other: Livro): Int {
        return anoPublicacao.compareTo(other.anoPublicacao)
    }
}