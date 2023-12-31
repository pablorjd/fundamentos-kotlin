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

    newTopic( "DATACLASS" )
    val myUser = User(0,"Pablo","Jiménez", Group.FRIEND.ordinal)

    // con el metodo copy puedo generar una nueva estancia de mi clase copiando algunos atributos desde donde se esta copiando y
    // editar otro que no quiero que se mantengas
    val bro = myUser.copy(1,"Cristobál")
    println( bro )
    println( myUser.component3() )
    println(myUser)


    newTopic("Funciones de Alcance")
    // las funciones de alcance engloban una clase y no es necesario llamar a la clase al momento de llamar una props o metodo dentro del with
    with(smartphone) {
        println( "Privado? ${isPrivate}" )
        call()
    }

    // con el apply podemos mutar las propiedades de una objeto
    bro.apply {
        group = Group.WORK.ordinal
        name = "Carlos"
        lastName = "Telles"
    }

    println(bro)
}