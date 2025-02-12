package org.example.lesson_2

const val DENOMINATOR_100_PERCENT = 100

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    val bonusCrystalOre = crystalOre * buffPercent/DENOMINATOR_100_PERCENT
    val bonusIronOre = ironOre * buffPercent/DENOMINATOR_100_PERCENT

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")

}