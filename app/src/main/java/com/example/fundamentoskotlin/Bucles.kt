package com.example.fundamentoskotlin


fun main(){
    newTopic("Bucles")
    showPersons("Angle", "david", "Daniel")
    showPersons("Angle", "david", "Ely", "Eliana")
}

fun showPersons(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons( vararg persons: String){
    println(persons[0])
    println(persons[1])
    newTopic("for")
    for(person in persons) println(person)
    newTopic("while")
    var index = 0
    while (index < persons.size){
        if (persons[index]=="Ely") println("Es Ely")
        println(persons[index])
        index++
    }

    newTopic("When")
    index = (0..persons.size-1).random()
    println(index)
    when (persons[index]){
        "Angle" -> println("Es Angel")
        "Ely" ->{
            println("Esposa David")
        }
        else -> println(persons[index])
    }
}