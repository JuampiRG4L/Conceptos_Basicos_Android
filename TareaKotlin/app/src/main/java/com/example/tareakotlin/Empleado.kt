package com.example.tareakotlin

//Clase Empleado heredada de clase Persona, en la interfaz Trabajador
class Empleado(private var Nombre: String, private var Edad: Int, private var Cargo: String) :Persona(Nombre, Edad), Trabajador {

    //Obtener grado
    public fun GetCargo(): String {
        return this.Cargo
    }
    //Establecer cargo
    public fun SetCargo(Cargo: String) {
        this.Cargo = Cargo.toString()
    }
    //Sobrescribir el metodo ToString
    override fun toString(): String {
        return "${super.toString()} Cargo del empleado: ${Cargo}"
    }
    //Ejecutar el metodo de interfaz
    override fun realizarTarea() {
        println("Realizando tarea laboral")
    }
}