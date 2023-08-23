package space.pablorjd.fundamentoskotlin.tarea

data class Task(val id: Long, val name:String, val description: String) {
}
open class Vehiculo(protected val velocidadMaxima:Int , protected val cantAsientos: Int ) {
    open fun cantidadAsientos(): Int {
        return cantAsientos
    }
    open fun velocidadMaxima(): Int {
        return velocidadMaxima
    }
}
class Auto(val isAutomatico:Boolean, velocidadMaxima:Int ,cantAsientos: Int): Vehiculo(velocidadMaxima,cantAsientos) {
    override fun cantidadAsientos(): Int {
        if (isAutomatico){
            return 8
        }else {
            return super.cantidadAsientos()
        }
    }
}

fun main() {
    val auto = Auto(false,100, 2)
    val cantidadAsientos = auto.cantidadAsientos()
    println(cantidadAsientos)
}