package org.example.lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    var move = "$from-$to;$moveNumber"
    println(move)

    from = "D2"
    to = "D3"
    moveNumber++

    move = "$from-$to;$moveNumber"
    println(move)

}