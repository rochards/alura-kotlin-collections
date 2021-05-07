package br.com.alura.collections.array

fun testaArray3() {

    val idades = intArrayOf(10, 14, 78, 14, 47, 68, 1, 47)

    println("Idades: ${idades.contentToString()}")
    println("Média de idades: ${idades.average()}")
    println("Todos são maiores de idades?: ${idades.all { it >= 18 }}")
    println("Pelo menor um é maior de idade?: ${idades.any { it >= 18 }}")

    val maioresDeIdade = idades.filter { it >= 18 }
    println("Maiores de idade: $maioresDeIdade")
    println("Algum igual a 18: ${maioresDeIdade.find { it == 18 }}")

}