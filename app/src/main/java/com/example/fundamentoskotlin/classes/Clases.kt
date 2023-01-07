package com.example.fundamentoskotlin.classes

import com.example.fundamentoskotlin.newTopic

fun main(){
    newTopic("Clases")
    val phone: Phone = Phone(996131803)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")
    val smartphone = Smartphone(990855,false)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Clases")

    val myUser = User(0,"David", "Ruiz",Group.FAMILY.ordinal)
    val bro = myUser.copy(1,"Daniel")
    val friend = bro.copy(id= 2, group = Group.FRIEND.ordinal)
    println(myUser.component3())
    println(myUser)
    println(bro)
    println(friend)

    newTopic("Funciones de Alcance")
    with(smartphone){
        println("Privado? $isPrivate")
        call()
    }

    friend.group = Group.WORK.ordinal
    friend.name = "Juan"
    friend.lastName = "Telles"

    friend.apply {
        group = Group.WORK.ordinal
        name = "Jun"
        lastName = "Telles"
    }
    println(friend)

}