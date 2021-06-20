package com.datatype.C4_oop.C4_6_static

import kotlin.math.min


//包级函数和变量
val pkgVal=100
fun pkgFun():Int{
    return 100000
}

fun main(args: Array<String>) {
    //包级函数和变量
    var a= minOf(0,1)
    a= pkgVal
    a= pkgFun()
    //region Description
    var lat: Latitude = Latitude.ofDouble(22.123)
    println(lat.value)

    println(Latitude.TAG)
    //endregion
}

//静态方法
class Latitude private constructor(val value: Double) {
    companion object {
        //region Description
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        //java可直接调用
        @JvmStatic
        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }
        //endregion

        //静态变量
        @JvmField //提供 Java调用
        val TAG: String = "latitude"
    }
}