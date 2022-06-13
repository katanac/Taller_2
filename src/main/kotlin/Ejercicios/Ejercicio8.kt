package Ejercicios


/*
En el nuevo edificio de la universidad, cada piso tendrá el mismo número
de salones y en todos los salones tendrán la misma capacidad (cantidad
de estudiantes que caben en el salón).
Escriba una función y un programa
que

calcule el número de salones y el número de pisos que tendrá el
nuevo edificio a partir del número de estudiantes que tiene la
universidad, la capacidad del salón y el número de salones que tendrá un
piso del edificio.


piso 1= 5 salones
        1 salon = 10 estudiantes

        calcule cuanto salones
        calcule cuantos pisos
 */
fun main(){
    //Entrada
    println("Ingrese una cantidad de estudiantes: ")
    val est= readLine()!!.toInt()

    println("El nuevo edificio tendra: ${numero_salones(est)} salones ")
    println("El nuevo edificio tendra: ${numero_pisos(est)} Pisos ")
}

fun numero_salones(est: Int): Int {
    val cs = est/2
    return cs
}

fun numero_pisos(est: Int): Int{
    val cp= est/2
    return cp
}

