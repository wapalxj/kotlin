package com.datatype.C5_advance_function.C5_2_

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
    val path: String = "G:\\GIT\\imooc\\vero\\c2_datatype\\src\\main\\kotlin\\com\\datatype\\C5_advance_function\\C5_2_\\vero.txt"

    val br = BufferedReader(FileReader(path))
    with(br) {
        var line: String?
        while (true) {
            line = readLine() ?: break
            println(line)
        }
        close()
    }

    //上面读取文本的替代
    br.readText()

    //use,自带关闭流功能
    BufferedReader(FileReader(path)).use {
        var line: String?
        while (true) {
            line = it.readLine() ?: break
            println(line)
        }
    }

}