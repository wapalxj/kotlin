package com.datatype.test.chart

//import com.datatype.test.jidaTime.Obj
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun main() {

    val min = Math.random() * 100
    val max = Math.random() * 100
    val interval = (max - min) / 4
    println("$min ==== $max ====$interval")
//    println(Obj("sad",16).age)
//    val accountSet = mutableSetOf<WebSocketRequest.Mt4Account>()
//    accountSet.add(WebSocketRequest.Mt4Account().apply {
//        this.account="xxxx1"
//        this.brokerID=100
//    })
//    val request = WebSocketRequest()
//    request.type = 10000
//    request.data = accountSet.toList()
//    val req = Gson().toJson(request)
//    println(req)
//
//    val intervalList = genIntervalList(interval)
//    println(intervalList.toList())
}

fun handleMin(min: Double, interval: Double): Double {
    if (min < interval) {
        return 0.0
    } else {
        val baseNum = genPowNum(interval) * 10
        // 去掉最小值不需要比较的位数
        // 如min为4776.9543 interval为200 那么formatMin = 4000
        // 如min为0.073 interval为0.005 那么formatMin = 0.07
        val formatMin = Math.floor(min / baseNum) * baseNum
        val minRange = min - formatMin

        // 找出适合的interval 这里为500
        // 所以最后的min = 4000 + 500 = 4500
        return formatMin + findMinInterval(minRange, interval)
    }
}

fun findMinInterval(minRange: Double, interval: Double): Int {
    val factorList = genIntervalList(interval)
    for (i in 1 until factorList.size) {
        if (minRange >= factorList[i]) {
            return factorList[i]
        }
    }
    return 0
}

fun genIntervalList(originInterval: Double): Array<Int> {
    val base = genPowNum(originInterval)

    println("base====$base")
    return arrayOf(10 * base, 5 * base, 2 * base, base)
}


// 获取数字的十的幂次方的位数
//  如 90 则为 1
// 如 0.01则为 -2
fun getPowBit(number: Double): Int {
    return floor(log10(number)).toInt()
}

/**
 * 生成十的幂次方
 * @param data
 */
fun genPowNum(data: Double): Int {
    val bit = getPowBit(data)
    return 10.0.pow(bit.toDouble()).toInt()
}


