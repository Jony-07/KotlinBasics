package com.example.kotlinbasics

fun main(){
    var number01: Float = 30f
    var number02: Float = 25f

    Suma(number01, number02)
    Resta(number01, number02)
}

fun Resta(number01: Float, number02: Float) {
    var function = object{}.javaClass.enclosingMethod.name
    var operation = number01 - number02
    println("$function: $number01 - $number02 => $operation")
}

fun Suma(number01: Float, number02: Float) {
    var function = object{}.javaClass.enclosingMethod.name
    var operation = number01 + number02
    println("$function: $number01 + $number02 => $operation")
}
