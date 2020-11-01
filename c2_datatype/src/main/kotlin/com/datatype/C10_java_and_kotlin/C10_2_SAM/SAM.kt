package com.datatype.C10_java_and_kotlin.C10_2_SAM

import java.util.concurrent.Executors

fun main(args: Array<String>) {
    val samInJava=SAMInJava()

    samInJava.addTask (object :Runnable{
        override fun run() {
            println("Hello ")
        }

    })

    //sam
    samInJava.addTask {
        println("Hello ")
    }


    val lambda={
        println("Hello ")
    }

    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)

    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)


    //只支持java接口
    //kotlin中并不支持
    val samInKotlin=SAMInKotlin()

    samInKotlin.addTask(Runnable {})

    //使用别名的方式
    //SAMInKotlin,typealias

//    samInKotlin.addTask {
//        println("Hello ")
//    }

}