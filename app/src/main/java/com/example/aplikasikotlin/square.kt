package com.example.aplikasikotlin

class square(val side: Int) {
    init {
        println(side * 10)
    }
}

fun main() {
    val s = square(16)
}