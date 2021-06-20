package xx_kotlin.lambda

fun main() {
    show {
        "ok $it"
    }

    //::  将一个函数作为参数传递
    show(::int2String)
    show(::int2Double)
}

//m:只要满足这个范式  (Int) -> String 的表达式都可以传进来
fun show(m: (Int) -> String) {
    m(100)
}

fun int2Double(i: Int): String {
    return "ok ${i * 1.0}"
}

fun int2String(i: Int): String {
    return "ok $i"
}
