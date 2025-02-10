class Estudiante(val curso: String,
                 val calificacionPromedio: Double,
                 nombre: String,
                 edad: Int,
                 id: String): Persona(nombre, edad, id) {

    fun mostrarRol(){
        println("ROL: Estudiante")
    }

    fun mostrarCalificacion(calificacionPromedio: Double){
        println(calificacionPromedio)
    }
}