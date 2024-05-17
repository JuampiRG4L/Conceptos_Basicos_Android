package com.example.tareakotlin

//Crear una clase base EmpleadoS
open class EmpleadoS (private var NombreE : String, private var Salario : Double, private var EdadE : Int){
    //Los métodos

    //para obtenerNombre
    public fun GetNombreE():String{
        return this.NombreE
    }
    //para establecerNombre
    public fun SetNombre(NombreE:String){
        this.NombreE = NombreE
    }
    //Para obtenerSalario
    public fun GetSalario():Double{
        return this.Salario
    }
    //Para establecerSalario
    public fun SetSalario(Salario: Double){
        this.Salario = Salario
    }
    //para obtenerEdad
    public fun GetEdad():Int{
        return this.EdadE
    }
    //para establecerEdad
    public fun SetEdad(EdadE: Int){
        this.EdadE = EdadE
    }
    //Metodo ToString
    override fun toString(): String {
        return "Nombre:${this.NombreE}, Edad:${this.EdadE}, Salario:${this.Salario}"
    }
}