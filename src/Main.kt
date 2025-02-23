fun main() {

    val persona1 = try {
        Persona("Lucía", 30, "P001")
    } catch (e: IllegalArgumentException) {
        println(e.message)
        null
    }

    println(persona1)
    persona1?.cumple()
    persona1?.actividad()

    val estudiante1 = try {
        Estudiante("Ingeniería", 8.7, "Pablo", 20, "E001")
    } catch (e: IllegalArgumentException) {
        println(e.message)
        null
    }

    println(estudiante1)
    estudiante1?.actividad()
    estudiante1?.mostrarCalificacion()


    val profesor1 = try {
        Profesor("Matemáticas", 15, "Fran", 45, "PR001")
    } catch (e: IllegalArgumentException) {
        println(e.message)
        null
    }

    println(profesor1)
    profesor1?.actividad()
    profesor1?.mostrarExperiencia()

    val estudiante2 = try {
        Estudiante("Ingeniería", 8.7, "Federico", -4, "E001")
    } catch (e: IllegalArgumentException) {
        println(e.message)
        null
    }

    println(estudiante2)
    estudiante2?.actividad()
    estudiante2?.mostrarCalificacion()
}


