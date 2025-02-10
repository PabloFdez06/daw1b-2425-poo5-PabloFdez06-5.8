class Profesor(val departamento: String,
               val aniosExperiencia: Int,
               nombre: String,
               edad: Int,
               id: String): Persona(nombre, edad, id) {

    fun mostrarRol(){
        println("ROL: Profesor")
    }

    fun mostrarExperiencia(aniosExperiencia: Int){
        println(aniosExperiencia)
    }
}