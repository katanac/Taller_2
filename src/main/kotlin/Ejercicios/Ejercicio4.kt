package Ejercicios

fun main(){
    //entradas
    println("Ingrese el sueldo recibido de Pedro ")
    val s= readLine()!!.toDouble()
    val sga=sueldo_gastado_arriendo(s)
    val sgc=sueldo_gastado_comida(s)
    //Salidas
    println("Gasto en arriendo: $sga ")
    println("Gasto en comida: $sgc")
   println("Dinero final de Pedro: ${dinero_final(s,sga,sgc)}  ")
}

fun sueldo_gastado_arriendo(s:Double):Double{
    val sga= s*0.40
    return sga
}
fun sueldo_gastado_comida(s:Double):Double{
    val sgc= s*0.15
    return sgc
}
fun dinero_final(s:Double,sga:Double,sgc:Double):Double{
    return s-(sga+sgc)
}


