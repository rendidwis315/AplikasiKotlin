package com.example.aplikasikotlin.Decor



fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = Aquarium.TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

// Kelas Shark
class Shark {
    val color: String = "Gray" // Contoh warna, Anda bisa sesuaikan dengan properti yang benar
    fun eat() {
        println("The shark is eating.")
    }
}

// Kelas Plecostomus
class Plecostomus {
    val color: String = "Brown" // Contoh warna, Anda bisa sesuaikan dengan properti yang benar
    fun eat() {
        println("The Plecostomus is eating.")
    }
}

fun main (){
    buildAquarium()
    makeFish()
}
