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






fun Main() {

    println("Selecciona tipo de operacion: 1.Suma ; 2.Resta ; 3.Multiplicacion ; 4.Division")


    val val1 = readLine()
    val val2 = readLine()


}

Main()