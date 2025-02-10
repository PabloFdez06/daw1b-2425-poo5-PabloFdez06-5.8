class Estudiante(val curso: String,
                 val calificacionPromedio: Double,
                 nombre: String,
                 edad: Int,
                 id: String) {


    fun mostrarCalificacion(calificacionPromedio: Double){
        println(calificacionPromedio)
    }
}