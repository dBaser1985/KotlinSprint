package org.example.lesson_2

const val COUNT_OF_STUDENTS = 4
const val SUM_OF_POINTS = 3 + 4 + 3 + 5

fun main() {

    val avgScore = SUM_OF_POINTS.toFloat() / COUNT_OF_STUDENTS

    println("%.2f".format(avgScore))

}