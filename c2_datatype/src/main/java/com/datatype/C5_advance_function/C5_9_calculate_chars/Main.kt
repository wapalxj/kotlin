package com.datatype.C5_advance_function.C5_9_calculate_chars

import java.io.File

fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()

    //统计build.gradle 字符数
    File("build.gradle")
            .readText()
            .toCharArray()
            .filterNot(Char::isWhitespace)
//            .forEach {
//                val count = map[it.toLowerCase()]
//                if (count == null) map[it.toLowerCase()] = 1
//                else map[it.toLowerCase()] = 1 + count
//            }
            .groupBy { it }//每个字符单独分组,一个字符对应一个List
            .map {
                it.key to it.value.size
            }
            .forEach (::println )


    map.forEach(::println)

}