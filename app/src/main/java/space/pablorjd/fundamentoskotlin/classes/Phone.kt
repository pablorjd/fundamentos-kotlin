package space.pablorjd.fundamentoskotlin.classes

/*
con la palabra reservada open, se habilita la herencia en
el lenguaje de programacion Kotlin
 */
open class Phone (protected val number: Int){

    fun call() {
        println("Llamando")
    }

    // para poder sobreescribier el metodo en las clases hijas
    // debemos de colocar el opoen al igual que la clase de la cual se va a heredad
    open fun  showNumber () {
        println("Mi numero es $number")
    }
}