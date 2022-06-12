package Ejercicios


fun main(){
    //Entradas
        println("Ingrese x: ")
        val x= readLine()!!.toDouble()
        println("Ingrese y: ")
        val y= readLine()!!.toDouble()

    // Salidas
        println("El resultado es: ${ejercicio_uno(x,y)}")
}

fun ejercicio_uno(x:Double, y:Double):Double{
    return Math.pow(x,2.0)-(2*x*y)+Math.pow(y,2.0)
}
