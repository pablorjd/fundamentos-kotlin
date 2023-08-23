package space.pablorjd.fundamentoskotlin

fun main () {
    sayHello()
}

// la funcion al hacerla privada solo puede ser invocada en esta clase o archivo .kt
private fun sayHello(): Unit {
    println("funciones")
}

// Unit === void => que no retorna ningun tipo de dato la funcion