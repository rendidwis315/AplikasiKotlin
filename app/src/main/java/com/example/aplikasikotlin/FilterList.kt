package com.example.aplikasikotlin

fun main (){
    println("====Filter List====")

    val book = listOf("nature" , "biology" , "birds")
    val hasilFilter = book.filter { it.length > 5}
    println(hasilFilter)

    //eager

    val instruments = listOf("viola", "cello", "violin")
    println("====Eager Filter====")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: " + eager)

    //map

    val numbers =setOf(1, 2, 3)
    println("====Map====")
    println(numbers)
    val a = numbers.map {it * 3 }
    println(a)

    //val numb1 =setOf(1, 2, 3)
    //val numb2 =setOf(1, 2, 3)
    //val numb3 =setOf(1, 2, 3)

    //val listOf(numb1, numb2, numb3)

    val temperature = 10
    val isHot = if (temperature > 30) true else false
    println(isHot)

}
