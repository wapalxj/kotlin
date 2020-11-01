package com.datatype.C9_genarics

fun main(args: Array<String>) {
    val a = 2
    val b = 3
    val c = maxOf(a, b)
    println(c)

    val complex=Complex<Double>(3.0,4.3)
    val complex2=Complex(3,6)
    println(complex)
    println(complex2)
}

fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a < b) b else a
}

data class Complex<T:Number>(val a: T, val b: T){

    override fun toString(): String {
        return "($a+${b}i)"
    }
}