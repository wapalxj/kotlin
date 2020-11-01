package com.datatype.C3

fun main(args: Array<String>) {
    println("${args[0]}")

    var sum = sum(1, 2)
    println(sum)


    //匿名函数
    println(sumFun(10,10))
}

fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

//	没有返回值默认返回Unit,对应java void
fun sum(){
//    return 1  //error
}

//简写
fun sum2(arg1: Int, arg2: Int) = arg1 + arg2

//匿名函数
val sumFun = fun(arg1: Int, arg2: Int) = arg1 + arg2