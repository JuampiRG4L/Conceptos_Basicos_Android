package com.example.tareakotlin

//Crear una subclase Gerente heredada de la clase base EmpleadoS
class Gerente (private var NombreE : String, private var Salario : Double, private var EdadE : Int, private var Bono: Double): EmpleadoS(NombreE, Salario, EdadE){
    //obtener Bono
    public fun GetBono():Double{
        return this.Bono
    }
    //establecer Bono
    public fun SetBono(Bono: Double){
        this.Bono = Bono
    }
    //Metodo ToString
    override fun toString(): String {
        return "${super.toString()}, tiene un bono de: ${Bono}"
    }
}