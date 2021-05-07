package br.com.alura.collections.list

fun testaLista2() {

    val livro1 = Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881)
    val livro2 = Livro("Iracema", "José de Alencar", 1865, "Editora B")
    val livro3 = Livro("Minha vida de menina", "Helena Morley", 1942, "Editora A")
    val livro4 = Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956)

    val listaDeLivros = mutableListOf(livro1, livro2, livro3, livro4)
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" } // o groupBy retorna um map de <String, List<Livro>>
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString(separator = "; ") { it.titulo }}")
        }
}