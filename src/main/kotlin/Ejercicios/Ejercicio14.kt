package Ejercicios

// 4. Escriba una función, y el correspondiente programa en Kotlin en el que a
//partir de los nombres y las edades de tres hermanos, obtenga el nombre
//del hermano mayor




class Persona {

    var nombre = readLine()!!.toString()
    var edad= readLine()!!.toInt()
   //

    constructor(nombre: String, edad: Int) {
        println("Ingrese nombre primer hermano")
        println("Ingrese edad primer hermano")
        this.nombre = nombre
        this.edad = edad
    }
}

fun calculoPersonaMayor(p1: Persona, p2: Persona, p3: Persona): Pair<String, Int> {

    val listadoPersonas: List<Persona> = listOf(p1, p2, p3)

    val mayorEntreP1P2 = Math.max(p1.edad, p2.edad)
    val mayor = Math.max(mayorEntreP1P2, p3.edad)

    listadoPersonas.forEach {
        if (it.edad == mayor) {
            return Pair(it.nombre, it.edad)
        }
    }
    return Pair("persona no existe", 0)
}


