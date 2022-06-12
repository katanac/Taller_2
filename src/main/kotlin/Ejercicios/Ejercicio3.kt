package Ejercicios

import java.lang.Math.*
import kotlin.math.pow


fun main() {
    //h^2 = a^2+b^2

    println("Calculo de longitud de una escalera")
    print("Ingrese la altura de la pared donde esta la escalera")
    var altura = readLine()!!.toString().toDouble()
    println("Ingrese la longitud del piso donde esta la escalera")
    var base = readLine()!!.toString().toDouble()

    print("la longitud de la escalera es de: ${calculoLongitudPendiente(altura, base)}")


}

fun calculoLongitudPendiente(altoPared: Double, basePiso: Double): Double {
    return ceil(sqrt(altoPared.pow(2.0) + basePiso.pow(2.0)))
}