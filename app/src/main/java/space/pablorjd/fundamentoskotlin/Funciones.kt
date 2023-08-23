package space.pablorjd.fundamentoskotlin

fun main () {
    sayHello()
    val result = sum(1,2)

    println(result)
}

// la funcion al hacerla privada solo puede ser invocada en esta clase o archivo .kt
// Unit === void => que no retorna ningun tipo de dato la funcion
private fun sayHello(): Unit {
    println("funciones")
}
// funcion con retorno escrita de manera normal
fun sum(a:Int, b:Int): Int {
    return a + b
}
// funcion con retorno escrita de manera abreviada
fun sub ( a:Int, b:Int ) = a - b
