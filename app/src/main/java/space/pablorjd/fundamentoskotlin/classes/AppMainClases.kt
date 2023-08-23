package space.pablorjd.fundamentoskotlin.classes

import space.pablorjd.fundamentoskotlin.newTopic

fun main() {
    newTopic("Clases")

    val phone:Phone =  Phone(977373470)
    phone.call()
    phone.showNumber()
    // println(phone.number)

    newTopic("Herencia")
    val smartphone = Smartphone(63124388, true)

    smartphone.call()
    newTopic("SobreEscritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")
}