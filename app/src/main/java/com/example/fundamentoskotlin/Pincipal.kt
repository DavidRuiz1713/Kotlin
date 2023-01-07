package com.example.fundamentoskotlin

const val separator = "===================="
fun main(){
    println("Hola David")
    newTopic("Hola David 2")

    newTopic( "Variables y Constantes")
    val a = 2
    var b = 2
    b=4
    println("a = $a")
    println("b = $b")
}

fun newTopic(topic: String){
    println()
    print("==================== ")
    print(topic)
    print(" ==================== ")
    println()

    print("\n$separator $topic $separator\n")
}