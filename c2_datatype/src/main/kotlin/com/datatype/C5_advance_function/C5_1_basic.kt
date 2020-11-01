package com.datatype.C5_advance_function

fun main(args: Array<String>) {
    args.forEach { it ->
        println(it)
    }

    //方式1   引用包级函数
    args.forEach(::println)

    //方式2   引用成员函数
    args.filter(String::isNotEmpty)

    val chars: CharArray = charArrayOf('a', '1', '2', 'c')
    println(chars.filter(Char::isDigit))//引用成员函数


    val hellWorld = Hello::world

    //方式3    调用者引用方法
    val pdfPrinter = PdfPrinter()
    args.forEach(pdfPrinter::println)
}

class PdfPrinter {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

class Hello {
    fun world() {
        println("Hello World")
    }
}