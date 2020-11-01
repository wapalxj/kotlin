package com.datatype.C5_advance_function.C5_5_closure

val string = "Hello World "

//返回一个函数
fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun main(args: Array<String>) {
//    val x = makeFun()
//    x()
//    x()
//    x()
//    x()
//    x()
//
//    val y = fibonacci()
//    println(y())
//    println(y())
//    println(y())
//    println(y())
//    println(y())
//    println(y())

//    for (i in fibonacci2()) {
//        if (i > 100) break
//        println(i)
//    }

    val add5 = add(5)
    println(add5(2))//7


}

fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return fun(): Long {
        val result = second
        second += first
        first = second - first
        return result
    }
}

fun fibonacci2(): Iterable<Long> {
    var first = 0L
    var second = 1L
    return Iterable {
        object : LongIterator() {
            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }

            override fun hasNext(): Boolean {
                return true
            }

        }
    }
}


//下面2个函数一样
fun add(x: Int) = fun(y: Int) = x + y

fun add2(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}