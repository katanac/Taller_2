package Ejercicios

class Ejercicio6 {
}

// Hallar el área del rectangulo
fun main(){
    //Entradas
    println("Ingrese la base del rectangulo: ")
    val b= readLine()!!.toDouble()
    println("Ingrese el altura del rectangulo: ")
    val a= readLine()!!.toDouble()
    // Salidas
    println("El resultado es: ${calcularAreaRectangulo(b,a)}")
}
fun calcularAreaRectangulo(a: Double, b: Double): Double {
    val ar = a * b
    return ar
}

// Hallar la hipotenusa del triangulo rectangulo a partir de los catetos
fun calcularHipotenusa(co:Double, ca:Double): Double{
    val h= Math.sqrt(Math.pow(co,2.0)+Math.pow(ca,2.0))
    return h
}

//Hallar área de un triángulo a partir de su base y su altura
fun calculoAreaTrianglo(b: Double, a: Double): Double {
    val at = (b * a) / 2
    return at
}


