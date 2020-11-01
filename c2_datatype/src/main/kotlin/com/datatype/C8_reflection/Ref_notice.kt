package com.datatype.C8_reflection

fun main(args: Array<String>) {
    //Reflection on built-in Kotlin types

    //String,Map,枚举异常
    //Int正常

//    String::class.members.forEach (::println)

    Int::class.members.forEach (::println)

}