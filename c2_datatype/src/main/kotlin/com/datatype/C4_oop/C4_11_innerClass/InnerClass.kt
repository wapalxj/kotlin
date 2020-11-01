package com.datatype.C4_oop.C4_11_innerClass

import kotlin.system.measureTimeMillis

open class Outter {
    val a: Int = 0

    class Inner {
        fun hello() {
//            println(a)
        }

    }

    inner class Inner2 {
        fun hello() {
            println(a)

            //类似于Java Outter.this.a
            println(this@Outter.a)
        }
    }
}

interface OnClickListener {
    fun onClick()
}


class View {
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>) {
    val inner = Outter.Inner()
//    val inner2=Outter.Inner2()


    val view = View()
    view.onClickListener = object : OnClickListener, Outter() {
        override fun onClick() {

        }
    }
    val listener = { -> println() }

//    view.onClickListener{
//        println()
//    }

}
