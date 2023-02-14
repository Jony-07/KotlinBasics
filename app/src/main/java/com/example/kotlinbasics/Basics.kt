package com.example.kotlinbasics

var username = "Jdev"
const val SPECIES = "Human"
//Constantes con mayúsculas
const val SEPARATOR = "=============== "
fun main(){
    var argument : String
    printTitles(argument = "Variables")
    print("Kotlin Basic")
    println()
    //variable
    //val es una variable de solo lectura
    //una variable con val no puede ser reasignada, pero una var sí
    //si se especifica el tipo de dato no puedes cambiar despues
    var age = 30
    print(age)
    println()
    val name = "Jony"
    println(name)
    //Para asignarse posteriormente
    var job: String
    job = "Developer"
    println(job)

    val languaje: String
    languaje = "Kotlin"
    println(languaje)

    //variable logal
    println(username)

    //Constantes
    println(SPECIES)
    printTitles(argument = "String Templates")
    //String templates
    println("My name is $name")
    println("My username is $username")
    println("I am ${SPECIES}")
    printTitles(argument = "DataTypes")
    // DataTypes
    val char: Char = 'a'
    val char2 : Char = 'l'
    print(char)
    println(char2)

    val string: String = "al"
    println(string)

    val boolean: Boolean = true
    println(boolean)

    //8 bit -128 to 127
    val jobs: Byte = 3
    println("$jobs trabajos")
    //16 bit -327668 to 32767
    val wordkedDays: Short = 200
    println("Días trabajados: $wordkedDays")
    //32 bit
    val workedMinutes: Int = 288000
    println("Minutos trabajados $wordkedDays")
    //64 bit
    val workedInMilliseconds: Long = 17280000000
    println("Milisegundos trabajados $workedInMilliseconds")

    //32 bit
    val heigh: Float = 1.75f
    println("Estatura: ${heigh}m")

    val heighDouble: Double = 1.753333333333
    println("Estatura real: ${heighDouble}m")
    printTitles("Funciones")
    basic()
    arguments(name)
    println(returnData())

    //Sobrecarga
    overload(age)
    overload(job)
    overload(job, languaje)
    overload(languaje=languaje)
}

fun printTitles(argument: String) {
    println("$SEPARATOR $argument $SEPARATOR")
}

fun overload(job:String = "Intern", languaje:String){
    println("Mi trabajo es $job con $languaje")
}


fun overload(job: String) {
    println("Mi trabajo es $job")
}

fun overload(age: Int) {
    println("Mi edad es $age")
}

fun returnData():String {
    return "Datos retornados"
}

fun arguments(name: String) {
    println("Hola $name")
}

fun basic(){
    println("hi")
}

fun printSubTitles(argument: String){
    println("$SEPARATOR - ${argument} - $SEPARATOR")
}