package Ejercicios

fun main(){
    //Entradas
    println("Ingrese un numero: ")
    val num_uno= readLine()!!.toDouble()
    println("Ingrese otro numero: ")
    val num_dos= readLine()!!.toDouble()

    println("El numero mayor es: ${numero_mayor(num_uno,num_dos)}")
}
 fun numero_mayor(num_uno:Double, num_dos:Double):Double{
    return if (num_uno>num_dos){
        num_uno
    } else
        num_dos
    }

