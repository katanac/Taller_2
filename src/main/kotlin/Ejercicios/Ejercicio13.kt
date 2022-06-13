package Ejercicios

fun main(){
    println("Ingrese el salario")
    val s= readLine()!!.toDouble()



    println("El nuevo salario del empleado es: ${nuevo_salario(s)}  ")
}

fun valor_aumento(s:Double): Double{
    return if (s<=800000)
        s * 0.10
    else if(s>800000 && s<= 1200000)
        s*0.8
    else s*0.5

}
fun nuevo_salario(s:Double):Double{
    return  s+ valor_aumento(s)
}
