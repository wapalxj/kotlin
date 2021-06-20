package com.datatype.C3.C3_9_param

fun main(args: Array<String>) {
    //具名参数
    sum(arg1 = 1, arg2 = 2)

    //变长参数
    hello(1, 2, 3, str = "ss")
    val array = intArrayOf(1, 2, 3, 4, 5)
    hello(*array, str = "vero")//*作用：目前用于变长参数中展开数组

    //默认参数
    hello(args = *array, int = 1)
}


//具名参数
fun sum(arg1: Int, arg2: Int) {}

//变长参数的等价
fun hello(args: Array<Int>) {}

//变长参数
fun hello(vararg args: String) {
    args.forEach(::println)
}

//变长参数
fun hello(vararg args: Int, str: String) {
    args.forEach(::println)
}


//默认参数
//double默认3.0
fun hello(double: Double = 3.0, vararg args: Int, int: Int) {
    args.forEach(::println)
}