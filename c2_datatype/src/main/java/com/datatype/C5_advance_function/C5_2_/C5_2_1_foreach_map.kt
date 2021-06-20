package com.datatype.C5_advance_function.C5_2_

fun main(args: Array<String>) {
    val list = listOf(1, 3, 4, 5, 6, 7, 10)

    var newList = ArrayList<Int>()
    list.forEach {
        val newElement = it * 2 + 3
        newList.add(newElement)
    }


    val newList1 = list.map {
        it * 2 + 3
    }

    val newList2 = list.map {
        it.toDouble()
    }
    val newList3 = list.map(Int::toDouble)

    newList3.forEach(::println)

}