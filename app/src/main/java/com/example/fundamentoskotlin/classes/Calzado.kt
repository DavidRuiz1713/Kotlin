package com.example.fundamentoskotlin.classes

data class Shoes (val id:Long, var model:String, var material: String, var size:Int) {

    open fun showModel(){
        println("El modelo es: $model")
    }
}
