package br.com.alura.collections.array

fun testaArray2() {

    val aumento = 1.1
    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 1000.0, 8000.0)

    println("Salários sem aumento: ${salarios.contentToString()}")

    // iterando pelos índices do array
    for (i in salarios.indices) {
        salarios[i] = salarios[i] * aumento
    }
    println("Salários com aumento: ${salarios.contentToString()}")

    // uma outra forma de iterar
    salarios.forEachIndexed { index, salario -> salarios[index] *= aumento }
    println("Salários com aumento: ${salarios.contentToString()}")

    val contatos = arrayOf("something", "something2", 14)
    println(contatos)
}