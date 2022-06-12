package Ejercicios

import kotlin.math.sqrt

fun main() {

    println("--CALCULO DE PUNTOS--")
    println("--Ingrese los datos del punto uno:")
    println("--X1:")
    val x1 = readLine()!!.toDouble()
    println("--Y1:")
    val y1 = readLine()!!.toDouble()

    println("--Ingrese los datos del punto dos:")
    println("--X2:")
    val x2 = readLine()!!.toDouble()
    println("--Y2: ")
    val y2 = readLine()!!.toDouble()

    println("-->RESULTADOS:")
    println("-->La distancia entre los dos puntos es: ${distanciaEntrePuntos(x1, x2, y1, y2)}")
    println(
        "-->La pendiente formada por los dos puntos es: ${
            pendienteEntrePuntos(
                x1,
                x2,
                y1,
                y2
            )
        }"
    )

    val datosPuntoMedio = puntoMedioEntreDosPuntos(x1, x2, y1, y2)
    println("-->La punto medio por los dos puntos es: (${datosPuntoMedio.first},${datosPuntoMedio.second})")
}

fun distanciaEntrePuntos(x1: Double, x2: Double, y1: Double, y2: Double): Double {
    //d(A,B) = sqrt{(x_2-x_1)^2+(y_2-y_1)^2 }
    return sqrt((Math.pow(y2 - y1, 2.0)) + Math.pow(x2 - x1, 2.0))
}


fun pendienteEntrePuntos(x1: Double, x2: Double, y1: Double, y2: Double): Double {
    //m=y2−y1/x2−x1
    return (y2 - y1) / (x2 - x1)
}

fun puntoMedioEntreDosPuntos(x1: Double, x2: Double, y1: Double, y2: Double): Pair<Double, Double> {
    //xm=x1+x2/2
    //ym=y1+y2/2
    val xm = (x1 + x2) / 2
    val ym = (y1 + y2) / 2
    return Pair(xm, ym)
}