package com.example.tareakotlin

//Creacion de una clase base FiguraGeometrica
open class FiguraGeometrica(private var Nombre : String, private var Color: String){

    //Obtener nombre de la figura
    public fun GetNombre():String{
        return this.Nombre
    }

    //Establecer nombre
    public fun SetNombre(Nombre: String){
        this.Nombre = Nombre
    }

    //Obtener color de la figura
    public fun GetColor():String{
        return this.Color;
    }

    //Establecer color
    public fun SetColor(Color: String){
        this.Color = Color
    }
    //Metodo ToString
    override fun toString(): String {
        return ("Nombre: ${this.Nombre}, Color: ${this.Color},")
    }
}