package com.datatype.C5_advance_function.C5_2_

fun main(args: Array<String>) {
    val list = listOf(
            1..20,//intRange
            2..6,
            100..205
    )
//    val flatList = list.flatMap {
//        it.map {
//            "No.$it"
//        }
//    }

    val flatList = list.flatMap { it }

//    flatList.forEach(::println)


//    sum(flatList)

//    (0..6).map(::factorial).forEach(::println)
//

//    println(
//            (0..6).map(::factorial).reduce { acc, i -> acc + i }
//    )


    //fold---带初始值的reduce
    println(
            (0..6).map(::factorial).fold(5) { acc, i -> acc + i }
    )

    //fold---带初始值的reduce
    println(
            (0..6).map(::factorial).fold(StringBuilder()) { acc, i ->
                acc.append(i).append(",")
            }
    )

    //foldRight---带初始值的reduce--带初始值的reduce,倒着遍历
    println(
            (0..6).map(::factorial).foldRight(StringBuilder()) { i, acc ->
                acc.append(i).append(",")
            }
    )


    //另外一种拼接字符串方法
//    println((0..6).joinToString(","))
}

//求和
fun sum(nums: List<Int>) {
    //acc表示上一次即计算结果
    //i表示当前遍历值
    println(nums.reduce { acc, i ->
        acc + i
    }

    )
}

//求阶乘
fun factorial(n: Int): Int {
    //acc表示上一次即计算结果
    //i表示当前遍历值
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}