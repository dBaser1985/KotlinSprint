package org.example.lesson_1

const val SECONDS_IN_MIN = 60

fun main() {

    //108 мин - полная длительность полета. 74 минуты - за пределами атмосферы в состоянии невесомости.
    val totalSecondsInSpace = 74 * SECONDS_IN_MIN

    val hoursInSpace = totalSecondsInSpace / (SECONDS_IN_MIN * SECONDS_IN_MIN)
    val remainingSeconds = totalSecondsInSpace % (SECONDS_IN_MIN * SECONDS_IN_MIN)

    val minutesInSpace = remainingSeconds / SECONDS_IN_MIN
    val secondsInSpace = remainingSeconds % SECONDS_IN_MIN

    println("%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace))

}
