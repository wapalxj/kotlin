package com.datatype.C4_oop.C4_8_extend

fun main(args: Array<String>) {
    //扩展函数
    println("abc".multiply(16))
    println("abc" * 16)

    //扩展属性
    "vero".b=50
}

//扩展函数
fun String.multiply(int: Int): String {
    val stringBuilder = StringBuilder()

    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

//扩展函数，运算符重载
operator fun String.times(int: Int): String {
    val stringBuilder = StringBuilder()

    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}


//扩展属性
val String.a:String
    get() = "vero"

var String.b:Int
    set(value) {

    }
    get() = 50
