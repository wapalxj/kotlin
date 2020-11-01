package com.datatype.C2

fun main(args: Array<String>) {
    val arrayOfInt: IntArray = intArrayOf(1, 2, 3, 4)
    val arrayOfChar: CharArray = charArrayOf('v', 'e', 'r', 'o')
    val arrayOfString: Array<String> = arrayOf("v", "e", "v", "v")

    println(arrayOfInt.size)

    println("arrayOfInt[1]==${arrayOfInt[1]}")

    for (int in arrayOfInt){
        println(int)
    }

    //转为字符串
    println(arrayOfChar.joinToString(""))

    //切片
    println(arrayOfString.slice(1..2))
}