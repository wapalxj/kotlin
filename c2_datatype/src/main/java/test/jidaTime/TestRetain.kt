package com.datatype.test.jidaTime

import com.sun.deploy.util.StringUtils
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

fun main() {
    //交集
    val mList1 = mutableListOf(0, 2, 4, 6, 8, 10)
    val mList2 = mutableListOf( 6, 8, 10)
    val mList3 = mutableListOf( "6", "8", "10")
//    mList2.retainAll(mList1)
//    println(StringUtils.join(mList3,","))
//

    val num=mList1.findLast {
        it<=6
    }
    val fl=1.01f
//    println(0.0000000000123456789123456789.toString())
//    println(Math.abs(0.05f- 0.0f).toDouble())


//
//    println(DateTime.now().toString("yyyy-MM-dd"))
//
//    val mills=DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime("2020-09-13").millis
//    println(DateTime(mills).toString("yyyy-MM-dd"))



}