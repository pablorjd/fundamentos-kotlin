package space.pablorjd.fundamentoskotlin

fun main() {
    // println("Hola Kotlin")
    newTopic( "Hola Kotlin" )

    newTopic( "Variable y constantes" )
    val a = 2 // no pueden mutar
    var b = "hola soy una variable" // estas pueden cambianr en el flujo de trabajo
    val tipoVariable: Int // a las variables y constantes se les puede asigna un tipo especifico
    println(a)
    println(b)
}

fun newTopic( topic: String ) {
    println("""
         "Este es un nuevo topic"
        $topic 
        """.trimIndent())
}