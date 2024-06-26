package com.example.depency_injection.module

class Carro (){
    fun darPartida(){
        val motor = Motor()
        motor.ligarMotor()
    }

}