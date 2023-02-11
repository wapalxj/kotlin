package test.followme

fun main() {

//    println(tString())

    var s1=null

    println(s1 as String?)
    println(s1 as? String ?:111)
    println(s1 as? String ?:111)
}

fun tString():String{
    //return null
    return DoubleUtil.name
}