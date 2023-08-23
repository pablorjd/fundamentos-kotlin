package space.pablorjd.fundamentoskotlin

import space.pablorjd.fundamentoskotlin.classes.Group
import space.pablorjd.fundamentoskotlin.classes.User

fun main () {
    newTopic("Colecciones")

    newTopic("Solo lectura")
    val frutaList = listOf<String>("Limon","Naranja","Manzana","Pera","Sandia")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Sandia es ${frutaList.indexOf("Sandia")}")


    newTopic("Colecciones Mutable")
    val userList = mutableListOf<User>(
        User(4,"Pedro","Chavez", Group.WORK.ordinal),
        User(5,"Litzi","Caceres", Group.FAMILY.ordinal),
        User(6,"Florencia","Jimenez", Group.FAMILY.ordinal),
        User(7,"Maximiliano","Jimenez", Group.FAMILY.ordinal),
        User(8,"Mauricio","Chavez", Group.FRIEND.ordinal)
    )


    returnData(userList)
    userList.add(User(9,"Alexander","Godoy",Group.WORK.ordinal))

    returnData(userList)
    userList.removeAt(0)

    returnData(userList)

    userList.set(1, User(8,"Mauricio","Chavez", Group.FRIEND.ordinal))
    returnData(userList)

    newTopic("Coleccion Map")
    val userMap = mutableMapOf<Int,User>()
    println(userMap)

    userMap.put(1,User(8,"Mauricio","Chavez", Group.FRIEND.ordinal))
    userMap.put(2,User(8,"Mauricio","Chavez", Group.FRIEND.ordinal))

    println(userMap)
}

fun returnData(list: MutableList<User>) {
    list.forEach {
        println(it)
        println("*******")
    }
}
