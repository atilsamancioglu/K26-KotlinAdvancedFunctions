package com.atilsamancioglu.kotlinhighorderfunctions

fun main() {
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    /*
    val smallNumbersList = myNumList.filter { num -> num < 6 }
    for (num in smallNumbersList) {
        println(num)
    }

     */
    val smallNumbersList = myNumList.filter { it < 6 }
    for (num in smallNumbersList) {
        println(num)
    }

    /*
    val squaredNumbers = myNumList.map { num -> num * num }
    for (num in squaredNumbers) {
        println(num)
    }

     */

    val squaredNumbers = myNumList.map { it * it }
    for (num in squaredNumbers) {
        println(num)
    }


    val filterAndMapCombined = myNumList.filter { it < 6 }.map { it * it }
    for (num in filterAndMapCombined) {
        println(num)
    }

    val musicians = listOf<Musician>(
        Musician("James",60,"Guitar"),
        Musician("Lars",55,"Drum"),
        Musician("Kirk",50,"Guitar")
    )

    val filteredMusicians = musicians.filter { musician -> musician.age < 60 }
                                    .map { musician -> musician.instrument }
    for (element in filteredMusicians) {
        println(element)
    }

}

class Musician(val name: String, val age: Int, val instrument: String)