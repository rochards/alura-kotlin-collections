package br.com.alura.collections.array

fun testaRange1() {


    val serie1 = 1.rangeTo(10)
    val serie2 = 1..10 step 2

    serie1.forEach { print("$it ") }
    println()
    serie2.forEach { print("$it ") }

}