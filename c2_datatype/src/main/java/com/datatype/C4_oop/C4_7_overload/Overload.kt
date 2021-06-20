package com.datatype.C4_oop.C4_7_overload

import java.util.ArrayList

class Overload {
    fun a(): Int {
        return 0
    }

    fun a(int: Int): Int {
        return 0
    }

    //不传参数，默认为0
    //即：结合了上面2个方法
    fun aa(int: Int = 0): Int {
        return 0
    }

    //给java调用，加上注解
    //否则 java不知道默认参数
    @JvmOverloads
    fun b(int: Int = 0): Int {
        return 0
    }
}

fun main(args: Array<String>) {
    val intList= ArrayList<Int>()

    intList.add(0)
    intList.add(1)
    intList.add(2)
    intList.add(3)

    //list的remove()重载
    //在kotlin中为2个方法
    intList.removeAt(1)
    intList.remove(3)

}