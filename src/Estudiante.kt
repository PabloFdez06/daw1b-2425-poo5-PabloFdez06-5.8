class Estudiante(val curso: String,
                 val calificacionPromedio: Double,
                 nombre: String,
                 edad: Int,
                 id: String) : Persona(nombre, edad, id){

    override fun actividad() {
        println("$nombre está estudiando en la carrera de $curso.")
    }

    fun mostrarCalificacion(){
        println(calificacionPromedio)
    }
}