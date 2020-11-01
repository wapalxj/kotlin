package com.datatype.C4_oop.C4_1_Abstract_Interface

/**
 * 与java的 不同
 */
abstract class A {
    var i = 0

    fun hello() {
        println()
    }
}

interface B {
    var j: Int

    fun hello2() {
        println(j)
    }

    fun hello3()
}

class C : A() {

}

class D(override var j: Int) : B {
    override fun hello3() {
    }
}

class E(override var j: Int) : A(), B {
    override fun hello3() {

    }
}

fun main(args: Array<String>) {
    val e = E(1)

    if (e is A) {

    }
    if (e is B) {

    }

}