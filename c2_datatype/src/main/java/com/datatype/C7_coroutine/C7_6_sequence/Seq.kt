package com.datatype.C7_coroutine.C7_6_sequence

fun main(args: Array<String>) {
    for (i in fibonacci){
        println(i)
        if (i>100) break
    }
}


val fibonacci = sequence {
    yield(1)
    var cur = 1
    var next = 1

    while (true) {
        yield(next)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}