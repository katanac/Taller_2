package Ejercicios

fun main() {
    println("--AREA DE UNA CORONA--")
    println("Ingrese el readio del circulo pequeño")
    val radioCirculoPequenio = readLine()!!.toString().toDouble()
    println("Ingrese el readio del circulo grande")
    val radioCirculoGrande = readLine()!!.toString().toDouble()

    val areaCirculo1 = calculoAreaDEUnCirculo(radioCirculoPequenio)
    val areaCirculo2 = calculoAreaDEUnCirculo(radioCirculoGrande)

    println("El area del circulo pequeño es: $areaCirculo1")
    println("El area del circulo Grande es: $areaCirculo2")
    println(
        "El area de la corona entre los dos circulos es: ${
            calculDeCoronaEntreCirculos(
                areaCirculo2,
                areaCirculo1
            )
        }"
    )
}


fun calculoAreaDEUnCirculo(radioCirculo: Double): Double {
    return Math.PI * (Math.pow(radioCirculo, 2.0))
}

fun calculDeCoronaEntreCirculos(areaCirculoPequenio: Double, areaCirculoGrande: Double): Double {
    return areaCirculoPequenio - areaCirculoGrande
}