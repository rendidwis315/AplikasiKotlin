package com.example.aplikasikotlin
import com.example.aplikasikotlin.buku
import com.example.aplikasikotlin.Aquarium
fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}



fun main() {
    println("Informasi Buku")
    println("============================")
    val buku1 = buku(" The Psychology of Money", "Morgan Housel", 2021, 268)
    buku1.tampilkanInfo()
    println("Aquarium")
    println("============================")
    buildAquarium()
}