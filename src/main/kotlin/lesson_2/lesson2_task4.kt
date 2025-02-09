package org.example.lesson_2

const val BUFF_20_PERCENT = 0.2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val bonusCrystalOre = (crystalOre * BUFF_20_PERCENT).toInt()
    val bonusIronOre = (ironOre * BUFF_20_PERCENT).toInt()

    println("Бонусная кристаллическая руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")

}