package com.datatype.C10_java_and_kotlin.C10_3_pattern

import java.util.regex.Pattern

fun main(args: Array<String>) {
    val source = "vero ,vnix,010-12345678"
    val pattern = """.*(\d{3}-\d{8}).*"""
//    val matcher = Pattern.compile(pattern).matcher(source)
//    while (matcher.find()) {
//        println(matcher.group())
//        println(matcher.group(1))
//    }

    //kotlin
    Regex(pattern)
            .findAll(source)
            .toList()
            .flatMap (MatchResult::groupValues)
            .forEach(::println)

}
