package com.example.depency_injection.module

class Motor(
){
    fun ligarMotor(){
        val combustivel = "Gasolina"

        if(combustivel == "Gasolina"){
            println("Motor Ligado")
        }else{
            println("Ligar Desligado")
        }
    }
}