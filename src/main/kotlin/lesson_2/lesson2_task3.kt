package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val departureHour = 9  // Час выезда
    val departureMinute = 39  // Минуты выезда
    val travelTimeInMinutes = 457  // Время в пути в минутах

    val departureTimeInMinutes = departureHour * MINUTES_IN_HOUR + departureMinute
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes

    val arrivalHour = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")

}