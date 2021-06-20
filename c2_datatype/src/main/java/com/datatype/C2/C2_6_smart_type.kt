package com.datatype.C2

fun main(args: Array<String>) {
    val parent: Parent = Child()
    if (parent is Child) {
        //不需要强转
        println(parent.name)
    }

    val string: String? = "Hello"
    if (string is String) {
        println(string.length)
    }

    val parent2: Parent = Parent()
    val child: Child? = parent2 as? Child//?安全的类型转换,类型不对返回Null
    println(child)
}