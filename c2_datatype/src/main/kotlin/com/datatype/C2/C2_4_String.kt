package com.datatype.C2

fun main(args: Array<String>) {
    val string: String = "vero"
    val fromChars: String = String(charArrayOf('v', 'e', 'r', 'o'))
//
//    println(string == fromChars)//相当于Java equals()
//    println(string === fromChars)//相当于Java ==


    //字符串模板
    val arg1: Int = 0
    val arg2: Int = 1

//    println("$arg1+$arg2=${arg1 + arg2}")

    val sayHello: String = "Hello \"vero\" "
//    println(sayHello)

    //salary
    val salary: Int = 1000
//    println("$$salary")//2行一致
//    println("\$$salary")//2行一致

    //"""
    val rawString: String = """
        sadsad
        \t
        \n
        $salary
        $ salary
        """
    println(rawString)
    println("len=" + rawString.length)
}