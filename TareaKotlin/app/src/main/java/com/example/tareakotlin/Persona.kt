package com.example.tareakotlin

//Se crea la clase personas, directamente con el constructor con los metodos de establecer y obtener.

open class Persona(private var Nombre : String, private var Edad: Int){

    //Obtener nombre del usuario
    public fun GetNombre():String{
        return this.Nombre
    }

    //Establecer nombre
    public fun SetNombre(Nombre: String){
        this.Nombre = Nombre
    }

    //Obtener edad del usuario
    public fun GetEdad():Int{
        return this.Edad;
    }

    //Establecer edad
    public fun SetEdad(Edad: Int){
        this.Edad = Edad
    }

    override fun toString(): String {
        return ("Nombre: ${this.Nombre}, Edad: ${this.Edad},")
    }
}