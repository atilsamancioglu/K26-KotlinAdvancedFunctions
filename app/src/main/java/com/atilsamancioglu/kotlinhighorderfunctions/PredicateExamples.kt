package com.atilsamancioglu.kotlinhighorderfunctions

fun main() {

    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    val allCheck = myNumList.all { it > 5 } //are all numbers greater than 5?
    println(allCheck)
    val anyCheck = myNumList.any { it > 5 } //is there any number greater than 5?
    println(anyCheck)
    val totalCount = myNumList.count { it > 5 } //how many numbers greater than 5?
    println(totalCount)
    val findNum = myNumList.find { it > 5 } //first number that is greater than 5?
    println(findNum)
    val findlastNum = myNumList.findLast {  it > 5 } //last number that is greater than 5?
    println(findlastNum)

    //if everytime we are searching for greater than 5, we can write it with a predicate
    val myPredicate = { num : Int -> num > 5 }
    val allCheckWithPredicate = myNumList.all(myPredicate)
    println(allCheckWithPredicate)

}