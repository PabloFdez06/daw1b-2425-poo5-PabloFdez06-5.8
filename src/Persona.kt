open class Persona(val nombre: String,
                   var edad: Int,
                   val id: String) {

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(edad >= 0) { "La edad no puede ser negativa." }
    }

    fun cumple() {
        println("$nombre ha cumplido años y ahora tiene ${edad + 1} años.")
    }

    open fun actividad() {
        println("$nombre está realizando una actividad.")
    }

    override fun toString(): String {
        return "Persona (nombre = $nombre, edad = $edad)"
    }
}