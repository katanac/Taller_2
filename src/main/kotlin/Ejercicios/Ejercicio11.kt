package Ejercicios

fun main() {
    println("Ingrese el numero a convertir:")
    val numeroAConvertir = readLine()!!.toDouble()
    val datosNumero = descompocicionDeUnNumero(numeroAConvertir)
    println("Cantidad Enteros ${datosNumero.first} y unidades ${datosNumero.second}")

    val numeroStringDigitos = numeroAConvertir.toString().replace(".0", "").length

    if (numeroStringDigitos < 3)
        println("Decimal Entero ${enterosARomanos(datosNumero.first)}${unidadesARomanos(datosNumero.second)}")
    else if (numeroStringDigitos >= 3 || numeroStringDigitos <= 0)
        println("No se puede convertir el numero ingresado")

}

fun descompocicionDeUnNumero(numero: Double): Pair<Double, Double> {

    val unidades = numero % 10
    val enteros = numero - unidades
    return Pair(enteros, unidades)
}

fun enterosARomanos(enteros: Double): String = when (enteros) {
    10.0 -> "X"
    20.0 -> "XX"
    30.0 -> "XXX"
    40.0 -> "XL"
    50.0 -> "L"
    60.0 -> "LX"
    70.0 -> "LXX"
    80.0 -> "LXXX"
    90.0 -> "XC"
    else -> ""
}


fun unidadesARomanos(enteros: Double): String = when (enteros) {
    1.0 -> "I"
    2.0 -> "II"
    3.0 -> "III"
    4.0 -> "IV"
    5.0 -> "V"
    6.0 -> "VI"
    7.0 -> "VII"
    8.0 -> "VIII"
    9.0 -> "IX"
    else -> ""
}