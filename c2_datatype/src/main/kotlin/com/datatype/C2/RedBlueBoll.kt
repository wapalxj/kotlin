package com.datatype.C2

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {

    println(SimpleDateFormat().format(System.currentTimeMillis()))
    val date=Calendar.getInstance()
    date.set(2019,8,19,21,15)
    println(date.timeInMillis)
    pick(10,6,1,date.timeInMillis)

}


//num 注数,默认1注
//redCount 红球数 默认6个
//blueCount 篮球数 默认1个
//seed
fun pick(count:Int=1,redCount:Int=6,blueCount:Int=1,seed :Long=0){
    //pick
    for (i in 1..count) {
        val red = mutableListOf(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33)

        val blue = mutableListOf(
                1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15, 16)

        for (num in 1..redCount) {
            //pick redCount red
            val pickRed = red.removeAt(Random(seed).nextInt(red.size))
            print(if (pickRed < 10) "0$pickRed" else pickRed)
            print(" ")
        }

        print("+")

        for (num in 1..blueCount) {
            //pick blueCount blue
            val pickBlue = blue.removeAt(Random(seed).nextInt(blue.size))
            print(if (pickBlue < 10) "0$pickBlue" else pickBlue)
            print(" ")
        }
        println()
    }
}