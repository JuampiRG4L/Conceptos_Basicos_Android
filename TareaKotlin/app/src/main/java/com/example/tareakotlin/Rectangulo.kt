package com.example.tareakotlin

open class Rectangulo(private var Nombre : String, private var Color: String, private var Longitud : Int, private var Ancho : Int, private var Radio: Int ): FiguraGeometrica(Nombre, Color){

    //Obtener la Longitud de la figura
    public fun GetLongitud():Int{
        return Longitud
    }

    //Establecer Longitud
    public fun SetLongitud(Longitud: Int){
        this.Longitud = Longitud
    }

    //Obtener Ancho de la figura
    public fun GetAncho():Int{
        return Ancho;
    }

    //Establecer Ancho
    public fun SetAncho(Ancho: Int){
        this.Ancho = Ancho
    }

    //Establecer Radio de la figura
    public fun GetRadio():Int {
        return Radio;
    }

    //Establecer Radio
    public fun SetRadio(Radio: Int){
        this.Radio = Radio
    }

    override fun toString(): String {
        return ("${super.toString()} Longitud: ${this.Longitud}, Ancho: ${this.Ancho}, Radio: ${this.Radio}")
    }
}