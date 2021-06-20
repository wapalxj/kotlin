package com.datatype.C10_java_and_kotlin.C10_4_Collections

fun main(args: Array<String>) {
    val  arrayList=ArrayList<String>()

    arrayList.add("vero")
    arrayList.add("vnix")
    arrayList.remove("vnix")
    arrayList.removeAt(0)

    //这个list/map并不能添加和删除
    val list= listOf("vero","vnix")
    val map= mapOf("key" to "value","vvvv" to "11111")


    val mList= mutableListOf<Int>()
    mList.add(1)
    mList.removeAt(0)


}


object Test{
    val list= listOf(1,2,3)
}