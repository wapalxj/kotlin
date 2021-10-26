import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat


fun getNoMoreThanTwoDigits(d: Double, count: Int): String {
    var unit = 1
    var number = BigDecimal("$d")
    if (number.toDouble() < 0) {
        unit = -1
        number=number.abs()
    }
//    var unit = 1
//    var number = d
//    if (number.toDouble() < 0) {
//        unit = -1
//        number*= unit
//    }
    var p = "0"
    if (count > 0) {
        p += "."
    }
    for (i in 0 until count) {
        p += "#"
    }
//    val format = DecimalFormat("0.###")
    val format = DecimalFormat(p)
    //未保留小数的舍弃规则，RoundingMode.FLOOR表示直接舍弃。
    format.roundingMode = RoundingMode.FLOOR
    return (if (unit < 0) {
        "-"
    } else "") + format.format(number)

}


fun formatNormal(d: Double, decimal: Int): String? {
    var formatDecimalString = ""
    formatDecimalString = when (decimal) {
        0 -> "######0"
        1 -> "######0.0"
        2 -> "######0.00"
        3 -> "######0.000"
        4 -> "######0.0000"
        5 -> "######0.00000"
        6 -> "######0.000000"
        7 -> "######0.0000000"
        else -> "######0.00"
    }
    val bigDecimal = BigDecimal(java.lang.String.valueOf(d))
    return DecimalFormat(formatDecimalString).format(bigDecimal.setScale(decimal, BigDecimal.ROUND_DOWN))

}

fun main(args: Array<String>) {
//    print(9999999999.999999)
    println(getNoMoreThanTwoDigits(-43535.1294,2))
    println(formatNormal(-43535.1294, 2))
//
//
//    val b1= Bean("a", 1)
//    val b2= Bean("aa", 2)
//    val b3= Bean("aaa", 3)
//    val b4= Bean("aaaa", 4)
//    val b5= Bean("aaaaa", 5)
//    val b6= Bean("aaaaaa", 2)
//    val b7= Bean("aaaaaaaa", 3)
//
//    val list= arrayListOf<Bean>()
//    list.add(b1)
//    list.add(b2)
//    list.add(b3)
//    list.add(b4)
//    list.add(b5)
//    list.add(b6)
//    list.add(b7)
//
//    println(list)
//
//    println(list.distinctBy {
//        it.id
//    })
}

class Bean(var name: String, var id: Int)