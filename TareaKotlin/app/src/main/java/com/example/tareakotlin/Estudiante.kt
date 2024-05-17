package com.example.tareakotlin

//Creación de una clase Estudiante herada de la clase Persona. Interfaz trabajador
class Estudiante(private var Nombre: String, private var Edad: Int, private var Grado: String) :Persona(Nombre, Edad), Trabajador{

    //Obtener grado
    public fun GetGrado():String{
        return this.Grado
    }
    //Establecer grado
    public fun SetGrado(Grado: String){
        this.Grado = Grado.toString()
    }

    //Sobrescribir el metodo ToString
    override fun toString(): String {
        return "${super.toString()} Grado de estudiante: ${Grado}"
    }

    //Ejecutar la interfaz
    override fun realizarTarea(){
        println("Realizando tarea escolar")
    }



}