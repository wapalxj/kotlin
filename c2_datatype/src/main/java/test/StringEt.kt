package com.datatype.test

fun main() {
//    val list= listOf(10,8,6,11,5,2,3,8,0)
    val list= arrayListOf(10,8,6,11,5,2,3,8,0)
    list.add(20)
    list.add(10)
    list.add(90)
    println(list)
    list.sortBy {
        it
    }
    println(list)
}