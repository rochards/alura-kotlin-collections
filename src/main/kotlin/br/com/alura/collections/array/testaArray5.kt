package br.com.alura.collections.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArray5() {

    val salarios = bigDecimalArrayOf("4010.40", "5000.00", "9500.55", "2555.0", "4780.0")
    println("Salários sem aumento: ${salarios.contentToString()}")

    val aumento = BigDecimal("1.1")
    val salariosComAumento = salarios
        .map { salario -> calculaAumento(salario, aumento) }
        .toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")
    println("Soma de todos os salários: ${salariosComAumento.sum()}")
    println("Salários ordenados: ${salariosComAumento.sorted()}")
    println("Três primeiros salários: ${salariosComAumento.take(3)}")
}

// estou criando o que chamamos de extension function
fun Array<BigDecimal>.sum() : BigDecimal {
    // aqui vai retornar o acc (accumulator)
    return this.reduce { acc, value -> acc + value }
}

private fun calculaAumento(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < BigDecimal("5000")) {
        salario + BigDecimal("500")
    } else {
        // setScale define as casas decimais
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

// vararg para receber vários valores
private fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    // preenche cada posição do array com os valores
    return Array(valores.size) { index -> valores[index].toBigDecimal() }
}