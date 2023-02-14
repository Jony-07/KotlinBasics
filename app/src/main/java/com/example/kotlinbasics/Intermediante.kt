package com.example.kotlinbasics

fun main() {
    printTitles("Sentencias condicionales")
    printSubTitles("If")
    if (true) {
        println("Condición exitosa")
    }
    //Equality
    printSubTitles("Equality")
    if (1 == 1) {
        println("1 es igual a 1")
    }
    //Equals
    printSubTitles("Equals")
    val jm = "Jony"
    if (jm.equals("Jony")) {
        println("Es lo mismo")
    }
    //Operadores Lógicos
    printSubTitles("Operadores Lógicos")
    if (1 != 2) {//Not
        println("1 es diferente que 2")
    }
    if (1 == 1 || 1 < 2) {
        println("1 es igual o menor a 2")
    }
    if (1 != 2 && 1 < 2) {
        println("1 es diferente y menor que 2")
    }
    if (1 == 1) {
        if (1 < 2) {
            println("If anidado")
        }
    }

    printSubTitles("If else")
    var a = 10
    var b = 5

    if (a > b) {
        println("a es mayor a b")
    } else {
        println("a no es mayor a b")
    }

    if (a < b) {
        println("a es menor a b")
    } else if (a == b) {
        println("a es igual a b")
    } else {
        println("a es mayor a b")
    }

    printSubTitles("When")
    val name = "Curso Kotlin"

    when (name) {
        "Karina" -> println("Hola Kari")
        "Pablo" -> println("Hola Pablin")
        "Jony",
        "Curso Kotlin" -> println("Hola Jony")
        "Pamela" -> println("Hola Pame")
        else -> println("Hola desconocido")

    }

    printTitles("Colecciones")
    printSubTitles("Vararg")
    multiArguments("Karina", "Pamela", "Pablo", "Juan")

    val array = arrayOf('p','a','m','e','l','a')
    println(array[0])
    println(array.get(1))
    println(array[2])
    val arrayStr: String = "pamela"
    println(arrayStr[3])

    //ListOf
    printSubTitles("listOf")
    val readOnlyList = listOf("Jony","Gissela","Laura")
    println("Read-Only: $readOnlyList")
    println("Name at 1 = ${readOnlyList.get(1)}")
}

fun multiArguments(vararg name: String){
    println("vararg es la posicion 0: ${name[0]}")
}