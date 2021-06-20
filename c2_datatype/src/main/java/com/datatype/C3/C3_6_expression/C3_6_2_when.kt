package com.datatype.C3.C3_6_expression

//when表达式
fun main(args: Array<String>) {
    val x = 5
    when (x) {//执行前一个语句后 ，自动break
        is Int -> println("$x")
        in 1..100 -> println("$x is in 1..100")
        !in 1..100 -> println("$x is not in 1..100")
        args[0].toInt() -> println("x == args[0]")
    }

    //也有返回值
    val mode = when {
        args.isNotEmpty() && args[0] == "1" -> 1
        else -> 0
    }

    println(mode)
}


