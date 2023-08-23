package space.pablorjd.fundamentoskotlin

const val separetor = "================" // constante global cuando se sabe el valor de la misma
fun main() {
    // println("Hola Kotlin")
    newTopic( "Hola Kotlin" )

    newTopic( "Variable y constantes" )
    val a = 2 // no pueden mutar
    var b = "hola soy una variable" // estas pueden cambianr en el flujo de trabajo
    val tipoVariable: Int // a las variables y constantes se les puede asigna un tipo especifico
    println(a)
    println(b)

    var objNull: String? // nuesta variable objetoNull se puede asignar un null colocando el simbolo de pregunta el simil de angular es que es una variable opcional

    objNull = null
    println(objNull)
    var cualquirTIpo: Any // al asignar Any la variable puede tener cualquier tipo de dato

}

fun newTopic( topic: String ) {
    println("""
        $topic 
        """.trimIndent())
}