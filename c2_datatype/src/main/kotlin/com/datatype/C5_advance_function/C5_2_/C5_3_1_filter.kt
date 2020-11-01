package com.datatype.C5_advance_function.C5_2_

fun main(args: Array<String>) {
    //取奇数
    println((0..6).filter {
        it % 2 == 1
    })

    //取偶数位置上的数
    println((0..6).filterIndexed { index, i ->
        index % 2 == 0
    })


}