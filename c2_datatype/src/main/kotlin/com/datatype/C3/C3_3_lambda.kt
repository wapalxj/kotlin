package com.datatype.C3


fun main(args: Array<String>) {

    println(sum(12, 2))
    //等价于
    println(sum.invoke(12, 2))

    args.forEach {
        it -> println(it)
    }

    args.forEach {
        println(it)
    }
    //等价于
    args.forEach(::println)

    //continue
    args.forEach continuing@{
        if (it == "3") {
            return@continuing
        }
        println(it)
    }

    //break
    run breaking@{
        args.forEach {
            if (it == "3") {
                return@breaking
            }
            println(it)
        }
    }

    println(sum)
    println("the end")
}


val sum = { arg1: Int, arg2: Int ->
    arg1 + arg2
}

val int2Long = fun(arg: Int): Long {
    return arg.toLong()
}