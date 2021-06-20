package com.datatype.C2

fun getName(): String? {//?表示可以返回null
    return null
}

fun main(args: Array<String>) {
    val name = getName() ?: "vero"//为Null则返回vero
    println(name?.length)//为Null则返回null，否则.length

    val value: String? = "vnix"
    println(value!!.length)//!!显示告诉编译器不为null
}