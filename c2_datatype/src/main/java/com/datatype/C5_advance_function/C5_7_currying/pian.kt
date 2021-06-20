package com.datatype.C5_advance_function.C5_7_currying

import java.nio.charset.Charset

/**
 * 偏函数
 */

fun main(args: Array<String>) {
    val consoleLogWithTag
            =::log.curried()("vero")(System.out)
    consoleLogWithTag("vnixxxxxxxxx")

    makeStringFromGbk("vero".toByteArray())
}

val makeString =fun(byteArray:ByteArray,charset: Charset):String{
    return String(byteArray,charset)
}

//偏函数：固定其中一个参数值
val makeStringFromGbk = makeString.partial2(charset("GBK"))

fun <P1,P2,R> Function2<P1,P2,R>.partial2(p2:P2)
        =fun(p1:P1)
        =this(p1,p2)
