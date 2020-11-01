package com.datatype.C9_genarics

fun main(args: Array<String>) {

    val list:List<*> = listOf(1,2)


    val comparable:Comparable<*> =object :Comparable<Any> {
        override fun compareTo(other: Any): Int {
            return 0
        }
    }

    val numbweArrayList:MutableList<*> = mutableListOf(3,5,6)

    val a=numbweArrayList[1]
    println(a)
    //不可写
//    numbweArrayList.set(1,)

}