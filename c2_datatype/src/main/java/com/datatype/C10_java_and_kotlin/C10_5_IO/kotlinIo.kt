package com.datatype.C10_java_and_kotlin.C10_5_IO

import java.io.File

fun main(args: Array<String>) {
    File("build.gradle")
            .readLines()
            .forEach (::println)
}