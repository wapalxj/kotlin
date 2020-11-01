package com.datatype.C9_genarics


fun main(args: Array<String>) {

    //协变<E>
    //正序:1,2,3是Number的子类
    val numberList:List<Number> = listOf(1,2,3)

    //逆变<T>
    //逆序:Int是Any的子类
    val intComparable:Comparable<Int> =object :Comparable<Any> {
        override fun compareTo(other: Any): Int {
            return 0
        }
    }

    //不变
    //泛型参数没有继承关系
    val numbweArrayList:MutableList<Number> = mutableListOf(3,5,6)



}