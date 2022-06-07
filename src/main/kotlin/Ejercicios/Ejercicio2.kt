package Ejercicios

import kotlin.math.ceil

fun main() {
    print("Estudiantes Gordos:")
    val estudiantesGordos = readLine()!!.toInt()
    print("Estudiantes Flacos:")
    val estudiantesFlacos = readLine()!!.toInt()
    print("Sillas:")
    val sillas = readLine()!!.toInt()
    print("los buses son:${bus(estudiantesGordos, estudiantesFlacos, sillas)}")
}

fun bus(gordos: Int, flacos: Int, sillas: Int): Int {
    require(sillas > 0 && gordos >= 0 && flacos >= 0)
    return ceil((gordos * 2 + flacos / sillas).toDouble()).toInt()
}
