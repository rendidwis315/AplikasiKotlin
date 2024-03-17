package com.example.aplikasikotlin

class house {
    var color: String = "green"
    val numberOfWindows: Int = 6
    val isForSale: Boolean = true

    fun updateColor(newColor: String) {
        this.color = newColor
    }
}

fun main() {
    val myhouse = house()
    println("Rumah saya berjendela ${myhouse.numberOfWindows}")
    println("Rumah saya apakah dijual: ${myhouse.isForSale}")
    println("Rumah saya berwarna ${myhouse.color}")

    // Mengubah nilai color House
    myhouse.updateColor("Purple")
    println("Rumah saya sekarang berwarna ${myhouse.color}")
}
