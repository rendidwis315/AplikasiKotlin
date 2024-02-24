package com.example.aplikasikotlin

fun main(args: Array<String>){
    biodata("Rendi")
    hobby("Boxing" , "Karena saya suka keributan")
}

fun biodata(Nama: String, Kelas: String ="2A"){
    val biodata ="""
        Nama: $Nama
        Kelas: $Kelas 
    """.trimIndent()
    print(biodata)
}
fun hobby(Nama: String, desc: String){
    println("hobby: $Nama")
    println(desc)
}