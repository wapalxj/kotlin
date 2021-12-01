import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import java.util.*

fun main() {
//    println(thisWeekTimeRangeSecond().toList())
//    println(thisWeekTimeRangeSecond2().toList())
//    println(todayTimeRangeSecond().toList())


    println(DateTime.now())
    println(DateTime.now(DateTimeZone.UTC))
}
/**
 * 获取本周的时间起始时间和终止时间 每一周从周一开始计算到周日 返回的是两个时间节点 单位秒
 */
fun thisWeekTimeRangeSecond(): LongArray {
    val now = DateTime.now()
    var todayMorning = DateTime(now.year, now.monthOfYear, now.dayOfMonth, 0, 0, 0)
    var index = now.dayOfWeek - 1
    val beforeDay = todayMorning.minusDays(index)
    return longArrayOf(beforeDay.millis / 1000, now.millis / 1000)
}

fun thisWeekTimeRangeSecond2(): LongArray {
    val now = DateTime.now()
    val todayMorning = DateTime(now.year, now.monthOfYear, now.dayOfMonth, 0, 0, 0)
    val index = now.dayOfWeek
    val beforeDay = todayMorning.minusDays(index)
    return longArrayOf(beforeDay.millis / 1000, now.millis / 1000)
}

fun todayTimeRangeSecond(): LongArray {
    val now = DateTime.now()
    var todayMorning = DateTime(now.year, now.monthOfYear, now.dayOfMonth, 0, 0, 0)
    return longArrayOf(todayMorning.millis / 1000, now.millis / 1000)
}
