package com.example.aplikasikotlin.utspemogramanmobiile

fun main() {
    // Inisialisasi mutableList dan tambah data List
    val clubs = mutableListOf(Club("Liverpool", 19, 8, 9, 6, 3))
    clubs.add(Club("Manchester United", 20, 12, 6, 3, 1))
    clubs.add(Club("Chelsea", 6, 6, 5, 2, 2))
    clubs.add(Club("Manchester City", 8, 8, 8, 0, 0))
    clubs.add(Club("Arsenal", 13, 14, 2, 0, 0))

    // Passing a named function ::sortByNumberTrophyTotal
    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    // Hasil sorting total trofi
    println("=====================================================")
    println("     Urutan klub berdasarkan jumlah total trofi:     ")
    println("=====================================================")
    for (club in sortedClubs) {
        println("Jumlah trofi ${club.name} : ${club.totalTrophy} ")
    }

    // Passing a named function ::filterByEuropeanTrophy
    val filteredClubs = filterAndSort(clubs, ::filterByEuropeanTrophy)
    // Hasil sorting total trofi
    println("=====================================================")
    println("   Klub yang belum pernah memenangkan UCL dan UEL:   ")
    println("=====================================================")
    for (club in filteredClubs) {
        println(club.name)
    }

    // Panggil extension function Club recap
    println("=====================================================")
    println("          Recap hasil perolehan tropi Club           ")
    println("=====================================================")
    println(clubs[0].recap())
    println(clubs[1].recap())
    println(clubs[2].recap())
    println(clubs[3].recap())
    println(clubs[4].recap())
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    val sortedClubs = clubs.sortedByDescending {
        it.totalTrophy
    }
    return sortedClubs
}

// Fungsi filter
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    val filteredClubs = clubs.filter {
        it.ucl == 0 && it.uel == 0
    }
    return filteredClubs
}