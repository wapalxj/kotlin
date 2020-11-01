package com.datatype.C2


/**
 * 不可隐式转换
 */
fun main(args: Array<String>) {
    val i: Int = 5
//    val l: Long = i//编译报错
    val ll: Long = i.toLong()

}