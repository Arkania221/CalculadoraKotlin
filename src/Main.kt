/*
¿Que debemos realizar?: Hay que hacer una calculadora
con cinco funciones: suma, resta, multiplicacion y division
ademas de la funcion principal

Realizacion del ejercicio:

    -Realizamos la creacion de las funciones, asi podemos
    visualizar el trabajo a realizar

    -Como la funcion principal llamara al resto, las demas
    funciones deben devolver un valor, el cual sera el resultado

    -Para poder devolder un resultado deberan primero operar, para
    optimizar el codigo, vamos a realizar el input dentro de la
    funcion principal y se pasaran como parametros a las demas funciones

    -De ultimo se imprimira en pantalla el resultado

    -Para poder realizar varias operaciones dentro del programa
    sin tener que iniciarlo cada vez, se insertara el main en un
    bucle

Explicaciones por si algun dia lo preciso:

la declaracion de una variable comienza con val (value)

de una funcion con fun (funcion)

el ?. se usa para evitar un nullpointerexepcion

"let" es una funcion que permite la ejecucion del siguiente bloque

de codigo en caso de que no sea null

?.toIntOrNull() pasa una str a un int, en caso de que no se pueda lo pasara a un
null en vez de dar error
*/




fun Suma(val1: Int, val2: Int): Int {

    val resultado = val1 + val2

    return resultado
}




fun Resta(val1: Int, val2: Int): Int {

    val resultado = val1 - val2

    return resultado
}



fun Multiplicacion(val1: Int, val2: Int): Int {

    val resultado = val1 * val2

    return resultado
}


fun Division(val1: Int, val2: Int): Int {

    val resultado = val1 / val2

    return resultado
}






fun main() {
    while (true) {
        println("Ingresa los valores")

        val val1 = readLine()?.toIntOrNull()
        val val2 = readLine()?.toIntOrNull()

        println("Selecciona tipo de operacion: 1.Suma ; 2.Resta ; 3.Multiplicacion ; 4.Division")

        val operacion = readLine()?.toIntOrNull()

        if (operacion != null) {

            val resultado: Int?
            if (operacion == 1) {
                resultado = val1?.let { v1 -> val2?.let { v2 -> Suma(v1, v2) } }
                println("Resultado: $resultado")
            } else if (operacion == 2) {
                resultado = val1?.let { v1 -> val2?.let { v2 -> Resta(v1, v2) } }
                println("Resultado: $resultado")
            } else if (operacion == 3) {
                resultado = val1?.let { v1 -> val2?.let { v2 -> Multiplicacion(v1, v2) } }
                println("Resultado: $resultado")
            } else if (operacion == 4) {
                if (val2 != 0) {
                    resultado = val1?.let { v1 -> val2?.let { v2 -> Division(v1, v2) } }
                    if (resultado != null) {
                        println("Resultado: $resultado")
                    }
                } else {
                    println("No se puede dividir por cero.")
                }
            } else {
                println("Seleccione una operacion disponible")
            }
        } else {
            println("Por favor seleccione una opción")
        }
    }
}



