package com.datatype.C3.C3_7_loop

fun main(args: Array<String>) {
//    for (arg in args) {
//        println(arg)
//    }
//
//    for ((index, value) in args.withIndex()) {
//        println("$index-> $value")
//    }
//
//    for (indexedValue in args.withIndex()) {
//        println("${indexedValue.index}-> ${indexedValue.value}")
//    }

    val list =MyIntList()

    list.add(1)
    list.add(2)
    list.add(6)

    for (i in list){
        println(i)
    }
}

class MyInterator(val iterator: Iterator<Int>) {
    operator fun next(): Int {
        return iterator.next()
    }

    operator fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

class MyIntList {
    private val list = ArrayList<Int>()

    fun add(int: Int) {
        list.add(int)
    }

    fun remove(int: Int) {
        list.add(int)
    }

//    operator fun iterator(): MyInterator {
//        return MyInterator(list.iterator())
//    }
    operator fun iterator(): Iterator<Int> {
        return list.iterator()
    }
}