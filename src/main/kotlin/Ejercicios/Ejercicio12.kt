package Ejercicios

fun main() {
    print("cual es el dia de hoy?")
    val diaIngresado = readLine()!!.toString()
    println("El dia  de maniana es:${dia(diaIngresado)}")
}

fun dia(x: String) = when (x) {
    "Lunes" -> "Martes"
    "Martes" -> "Miercoles"
    "Miercoles" -> "Jueves"
    "Jueves" -> "Viernes"
    "Viernes" -> "Sabado"
    "Sabado" -> "Domingo"
    "Domingo" -> "Lunes"
    else -> "El dia ingresadoo existe"
}
