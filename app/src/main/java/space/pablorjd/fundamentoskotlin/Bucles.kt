package space.pablorjd.fundamentoskotlin

fun main() {
    newTopic("Bucles")
    showPersons("Pablo", "Litzi", "Florencia")
    showPersons("Pablo", "Litzi", "Florencia", "Maximiliano")
}

fun showPersons (p1: String, p2:String, p3: String) {
    println(p1)
    println(p2)
    println(p3)
}

// funcion con arreglo de parametros
fun showPersons( vararg persons: String) {
    // foreach
    newTopic("foreach")
    persons.forEach {
        println(it)
    }

    // forin
    newTopic("ForIn")
    for (person in persons) {
        println(person)
    }

    newTopic("while")
    var index = 0
    while (index < persons.size ) {
        if(persons[index] == "Litzi") {
            println("Es Litzi <3")
        }
        println(persons[index])
        index++
    }

    newTopic("When")
    // asi se define un rango en kotlin
    index = (0..persons.size-1).random()

    when(persons[index]) {
        "Pablo" -> println("Es Pablo")
        "Litzi" -> println("Es Litzi")
        "Florencia" -> println("Es Florencia")
        "Maximiliano" -> println("Es Maximiliano")
    }
}