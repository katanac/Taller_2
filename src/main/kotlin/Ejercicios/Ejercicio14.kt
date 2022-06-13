package Ejercicios

// 4. Escriba una función, y el correspondiente programa en Kotlin en el que a
//partir de los nombres y las edades de tres hermanos, obtenga el nombre
//del hermano mayor

fun main() {
    println("INGRESE LOS DATOS DE LOS HERMANOS")

    println("Nombre hermano 1")
    val nombre = readLine()!!.toString()
    println("Edad hermano 1")
    val edad = readLine()!!.toInt()
    val hermano1 = Hermano(nombre, edad)


    println("Nombre hermano 2")
    val nombre2 = readLine()!!.toString()
    println("Edad hermano 2")
    val edad2 = readLine()!!.toInt()
    val hermano2 = Hermano(nombre2, edad2)


    println("Nombre hermano 3")
    val nombre3 = readLine()!!.toString()
    println("Edad hermano 3")
    val edad3 = readLine()!!.toInt()
    val hermano3 = Hermano(nombre3, edad3)

    println("El hermano mayo es: ${calculoHermanoMayor(hermano1,hermano2,hermano3).first}")
}


class Hermano(var nombre: String, var edad: Int) {

}

fun calculoHermanoMayor(h1: Hermano, h2: Hermano, h3: Hermano): Pair<String, Int> {

    val listadoPersonas: List<Hermano> = listOf(h1, h2, h3)

    val mayorEntreH1H2 = Math.max(h1.edad, h2.edad)
    val mayor = Math.max(mayorEntreH1H2, h3.edad)

    listadoPersonas.forEach {
        if (it.edad == mayor) {
            return Pair(it.nombre, it.edad)
        }
    }
    return Pair("persona no existe", 0)
}


