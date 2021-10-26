package com.followme.basiclib.utils

import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*


fun main() {
//    var a: Double? = null
//    println(a.digits())
//    println(5.0123456.digits())
//    println("5.11111111111".digits())
    println(getStringByDigits(5.0,0))
}

fun Double?.digits(maxDigits: Int = 5): Int {
    return this?.toString()?.digits(maxDigits) ?: 0
}

fun String?.digits(maxDigits: Int = 5): Int {
    return try {
        if (!this!!.contains(".")) {
            0
        } else {
            minOf(maxDigits, this.split(".")[1].length)
        }
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
}

fun getStringByDigits(num: Double, digits: Int): String? {
    if (digits == 0) {
        return num.toInt().toString()
    } else {
        val instance: NumberFormat = formatPattern()
        instance.minimumFractionDigits = digits
        instance.maximumFractionDigits = digits
        return instance.format(num).replace(",", "")
    }
}

fun formatPattern(): DecimalFormat {
    val enlocale = Locale("en", "US")
    return NumberFormat.getNumberInstance(enlocale) as DecimalFormat
}