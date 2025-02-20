package org.example.lesson_2

import kotlin.math.pow

const val ONE_HUNDRED_PERCENT_IN_DECIMAL = 1

fun main() {

    val initialAmount = 70000
    val numberOfYears = 20
    val percentageRrate = 0.167

    val finalAmountOfDeposit = initialAmount * (ONE_HUNDRED_PERCENT_IN_DECIMAL + percentageRrate).pow(numberOfYears)

    println("Размер вклада через 20 лет: %.3f".format(finalAmountOfDeposit))

}