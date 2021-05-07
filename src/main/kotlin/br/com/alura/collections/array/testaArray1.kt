package br.com.alura.collections.array

fun testaArray1() {

    val idades = intArrayOf(25, 34, 15, 48)

    // forma mais comum de percorrer o array
    for (idade in idades) {
        print("$idade ")
    }

    println()
    // outra forma
    idades.forEach { idade -> print("$idade ") }

    println()
    // it se refere a cada elemento do array
    idades.forEach { print("$it ") }

    val maiorIdade = idades.maxOrNull()!!
    val menorIdade = idades.minOrNull()!!

    println()
    println("Maior idade do array: $maiorIdade")
    println("Maior idade do array: $menorIdade")
}