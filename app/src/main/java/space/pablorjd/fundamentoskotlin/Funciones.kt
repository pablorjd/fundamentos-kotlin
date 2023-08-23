package space.pablorjd.fundamentoskotlin

import kotlin.math.abs

fun main () {
    sayHello()
    val result = sum(1,2)

    println(result)
    newTopic("Infix function")
    val c = -3
    println( c.enableAbs(false) )

    newTopic("sobrecarga")
    showProducs("soda")

    showProducs("soda", "15","5 de Abril")
    showProducs("pasteles", validity = "hasta el 15 de marzo")
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

// funciones Infix ==> agrega una nueva funcionalidad a la clase con la que se crea en este caso Int
infix fun Int.enableAbs( enable: Boolean ) = if (enable) abs(this) else this

// funciones con sobrecargo de los metodos

fun showProducs ( name: String, promo:String = "Sin promoción", validity:String = "Hasta agotar Stock" ) {
    println("$name = $promo $validity")
}
