package com.datatype.C3.C3_10_calculator

fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入算式例如：3 + 4")
            val input = readLine() ?: break
            val splits = input.trim().split(" ")
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            println("$arg1 $op $arg2  = ${Operator(op).apply(arg1, arg2)}")
        } catch (e: Exception) {
            e.printStackTrace()
        }
        println("继续？[Y]")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y") {
            break
        }
    }

}

class Operator(op: String) {
    //定义运算符
    val opFun: (left: Double, right: Double) -> Double;

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            "%" -> { l, r -> l % r }

            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}