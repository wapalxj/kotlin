package com.datatype.C2

fun main(args: Array<String>) {
    val range: IntRange = 0..1024//[0,1024]
    val range_exclusive: IntRange = 0 until 1024//[0,1024)
    val range_empty: IntRange = 0..-1

    println(range.contains(50))
    println(50 in range)

    for (i in range){
        println("$i")
    }
}