package com.example.aplikasikotlin

fun main(args: Array<String>){
    biodata("Rendi")
    hobby("GYM" , "karena saya ingin memiliki badan seperti Arnold Swainstrager")
}

fun biodata(Nama: String, Kelas: String ="2A"){
    val biodata ="""
        -------------------------------
        *        Biodata Saya         *
        -------------------------------
        Nama: $Nama
        Kelas: $Kelas 
    """.trimIndent()
    print(biodata)
}
fun hobby(Nama: String, desc: String){
    val hobby = """
        -------------------------------
        *        Hobby saya           *
        -------------------------------
    hobby = $Nama
    desc = $desc
    """
    println(hobby)
}