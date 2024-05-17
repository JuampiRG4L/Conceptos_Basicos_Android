package com.example.tareakotlin

fun main() {
    val Estudiante1: Estudiante = Estudiante("David", 18, "12")
    println(Estudiante1)
    Estudiante1.realizarTarea()

    val Empleado1: Empleado = Empleado("David", 18, "Tarrainusumizador de 5g")
    println(Empleado1)
    Empleado1.realizarTarea()

    val FiguraGeometrica1: FiguraGeometrica = FiguraGeometrica("Hexagono", "Verde")
    println(FiguraGeometrica1)

    val Rectangulo: Rectangulo = Rectangulo("Rectangulo", "Rojo", 18, 35, 8)
    println(Rectangulo)

    val Circulo: Circulo = Circulo("Circulo", "Dorado", 40, 35, 10)
    println(Circulo)

    val Gerente1:Gerente = Gerente("David", 1900000.0, 30, 50000.0)
    println(Gerente1)

    val Vendedor1:Vendedor = Vendedor("David", 1900000.0, 30, 45000.0)
    println(Vendedor1)

}