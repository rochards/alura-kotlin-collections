package br.com.alura.collections.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArray4() {

    // incializa todos as posições com o valor entre {}
//    val salarios1 = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    println("Valores iniciais: ${salarios1.contentToString()}")
//    salarios1[0] = BigDecimal("1500.55")
//    salarios1[1] = "2500.14".toBigDecimal()
//    println("Valores posteriores: ${salarios1.contentToString()}")

    val salarios = bigDecimalArrayOf("4010.40", "5000.00", "9500.55")
    println("Salários sem aumento: ${salarios.contentToString()}")

    val salariosComAumento = salarios
        .map { salario ->
            if (salario < BigDecimal("5000")) {
                salario + BigDecimal("500")
            } else {
                // setScale define as casas decimais
                (salario * BigDecimal("1.1")).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()
    println("Salários com aumento: ${salariosComAumento.contentToString()}")
}

// vararg para receber vários valores
private fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    // preenche cada posição do array com os valores
    return Array(valores.size) { index -> valores[index].toBigDecimal() }
}