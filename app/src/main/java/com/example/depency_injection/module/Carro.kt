package com.example.depency_injection.module

class Carro(private val motor: Motor){
    fun darPartida(){
        motor.ligarMotor()
    }

}