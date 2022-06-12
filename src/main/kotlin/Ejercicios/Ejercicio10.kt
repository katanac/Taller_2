package Ejercicios

fun main() {
    println("CALCULO DE UN NUMERO SEGUN OPERADOR")
    println("Operador:")
    val operador = readLine()!!.toString()
    println("Numero 1")
    val numero1 = readLine()!!.toDouble()
    println("Numero 2 en :")
    val numero2 = readLine()!!.toDouble()

    println(
        "El resultado de la operacion es: ${
            operacionSegunOperador(
                operador,
                numero1,
                numero2
            )
        }"
    )

}

fun operacionSegunOperador(x: String, numero1: Double, numero2: Double): Double = when (x) {
    "*" -> numero1 * numero2
    "+" -> numero1 + numero2
    "-" -> numero1 - numero2
    "/" -> numero1 / numero2
    "%" -> numero1 % numero2
    else -> 0.0
}