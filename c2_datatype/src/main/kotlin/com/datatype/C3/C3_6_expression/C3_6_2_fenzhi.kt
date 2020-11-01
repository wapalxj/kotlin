package com.datatype.C3.C3_6_expression

//分支表达式
private const val USERNAME = "admin"
private const val PWD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {
//    var mode = USER
//    if (args.isNotEmpty() && args[0] == "1") {
//        mode = DEBUG
//    }

    //if语句是有返回值的
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        DEBUG
    } else {
        USER
    }


    println("输入 用户名：")
    val username = readLine()
    println("输入 密码：")
    val pwd = readLine()

    if (mode == DEBUG && username == USERNAME && pwd == PWD) {
        println("管理员登录成功")
    } else if (username == USERNAME && pwd == PWD) {
        println("登录成功")
    } else {
        println("登录失败")
    }


}


