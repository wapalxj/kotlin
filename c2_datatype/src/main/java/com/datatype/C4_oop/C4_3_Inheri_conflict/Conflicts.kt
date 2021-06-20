package com.datatype.C4_oop.C4_3_Inheri_conflict

abstract class A {
    open fun x(): Int = 5
}

interface B {
    fun x(): Int = 1
}

interface C {
    fun x(): Int = 0
}

class D(val y: Int = 0) : A(), B, C {
    override fun x(): Int {
        println("call x():Int in  D")
        if (y > 0) {
            return y
        } else if (y < -200) {
            return super<C>.x()
        } else if (y < -100) {
            return super<B>.x()
        } else {
            return super<A>.x()
        }
        return 0
    }
}

fun main(args: Array<String>) {
    println(D(3).x())
    println(D(-10).x())
    println(D(-110).x())
    println(D(-220).x())
}