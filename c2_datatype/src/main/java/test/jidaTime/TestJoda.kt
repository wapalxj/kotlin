package com.datatype.test.jidaTime

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

fun main(args: Array<String>) {
    val TIME_SLASH = "yyyy/MM/dd HH:mm:ss"


//    val nowTime = DateTime.now()
//            .hourOfDay().setCopy(0)
//            .minuteOfHour().setCopy(0)
//            .secondOfMinute().setCopy(0)
//            .millisOfSecond().setCopy(0)
//            .millisOfDay().setCopy(0)

    val nowTime2 = DateTime(1572220801000)
    DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")
    println("nowTime== ${ nowTime2.millis}")

//    check("https://alibetaqrcode.followme-internal.com/xxxxx?uid=123456&index=10")

}

private fun check(url: String) {

    var uid = ""
    var index = ""
    url.split('?')[1]
            .split('&')
            .filter { it.contains('=') }
            .forEach {
                val keyValue = it.split('=')
                if (keyValue.size == 2) {
                    when (keyValue[0]) {
                        "uid" -> uid = keyValue[1]
                        "index" -> index = keyValue[1]
                    }
                }
            }

    println(uid)
    println(index)
}