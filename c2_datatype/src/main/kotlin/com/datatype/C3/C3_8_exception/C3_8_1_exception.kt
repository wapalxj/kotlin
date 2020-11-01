package com.datatype.C3.C3_8_exception


fun main(args: Array<String>) {
    try {
        val arg1 = args[0].toInt()
        val arg2 = args[1].toInt()
        println("$arg1+$arg2=${sum(arg1, arg2)}")
    }catch (e:NumberFormatException){
//        e.printStackTrace()
        println("参数类型不对")
    }catch (e:ArrayIndexOutOfBoundsException){
//        e.printStackTrace()
        println("参数个数不对")
    }catch (e:Exception){
//        e.printStackTrace()
        println("未知异常")
    }finally {
        println("666666666")
    }


    //同样是表达式
    val result=try {
        1/0
    }catch (e:Exception){
        100
    }
    println(result)
}

fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}
