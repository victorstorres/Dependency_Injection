package com.example.depency_injection.module

class Motor(
){
    private lateinit var Combustivel: Combustivel

    fun ligarMotor(){

        val combustivel = Combustivel("Gasolina")
        if(combustivel.combustivel == "Gasolina"){
            println("Motor Ligado")
        }else{
            println("Ligar Desligado")
        }
    }

    fun setCombustivel(combustivelRecebido: Combustivel){
        this.Combustivel = combustivelRecebido
    }

}