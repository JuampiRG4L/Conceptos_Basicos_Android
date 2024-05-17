package com.example.tareakotlin

//Crear una subclase Vendedor heredad de clase base EmpleadoS
class Vendedor (private var NombreE : String, private var Salario : Double, private var EdadE : Int, private var Comision: Double): EmpleadoS(NombreE, Salario, EdadE){
    //obtener Comision
    public fun GetComision():Double{
        return this.Comision
    }
    //establecer Comision
    public fun SetComision(Comision: Double){
        this.Comision = Comision
    }
    //Metodo ToString
    override fun toString(): String {
        return "${super.toString()}, tiene una comision sobre las ventas de: ${Comision}"
    }
}