package br.com.alura.collections.list

fun testaLista1() {

    val livro1 = Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881)
    val livro2 = Livro("Iracema", "José de Alencar", 1865, "Editora B")
    val livro3 = Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A")
    val livro4 = Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956)

    val livros = mutableListOf(livro1, livro2, livro3, livro4)
    livros.print()

    // cuidado com o método sortBy pq ele muda a lista original
    val livrosOrdenados1 = livros.sorted()
    println()
    println("Livros ordenados por ano de publicação")
    livrosOrdenados1.print()

    println()
    println("Livros ordenados por título")
    livros.sortedBy { it.titulo }.print()

    println()
    println("A lista original não tem seus elementos reordenados")
    livros.print()
}

// extension function
private fun List<Livro>.print() {
    val formattedPrint = this.joinToString(separator = "\n") { "- ${it.titulo} de ${it.autor}" }
    println("### Lista de Livros ###")
    println(formattedPrint)
}