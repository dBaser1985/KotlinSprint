package org.example.lesson_1

const val SECONDS_IN_MIN = 60

fun main() {

    /*    Задача 5* к Уроку 1

    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
    - Значения часов, минут и секунд отображать двумя цифрами.
     */

    /* Алгоритм решения:
    1. Задаем переменную с исходным общим количеством секунд
    2. Получаем целое количество часов поделив исходные секунды на количество секунд в часе (60*60=3600)
    3. Получаем количество минут - остаток от деления на количество часов делим на колво секунд в минуте
    4. Получаем секунды - остаток от деления при получении минут
    5. Выполняем форматированный вывод результата
     */

    val totalSecondsInSpace = 123456

    val hoursInSpace = totalSecondsInSpace / (SECONDS_IN_MIN * SECONDS_IN_MIN)
    val remainingSeconds = totalSecondsInSpace % (SECONDS_IN_MIN * SECONDS_IN_MIN)

    val minutesInSpace = remainingSeconds / SECONDS_IN_MIN
    val secondsInSpace = remainingSeconds % SECONDS_IN_MIN

    println("%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace))

}
