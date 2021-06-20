package com.datatype.C5_advance_function.C5_7_currying

import java.io.OutputStream

fun main(args: Array<String>) {
    log("vero",System.out,"vvvvvv")
//    log("vero")(System.out)("uuuuuuuuuu")

    ::log.curried()("vero")(System.out)("uuuuuuuuuu")
}


fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("$tag $message\n".toByteArray())
}


//fun log2(tag:String):(target:OutputStream)->(message:Any?)->{
//    return fun (target:OutputStream):(message:Any?)->{
//        return fun(message:Any?){
//            target.write("$tag $message\n".toByteArray())
//        }
//    }
//}

//fun log(tag: String)
//        = fun(target: OutputStream)
//        = fun(message: Any?)
//        = target.write("$tag $message\n".toByteArray())

//扩展Function3
fun<P1,P2,P3,R> Function3<P1,P2,P3,R>.curried()
        =fun(p1:P1)
        =fun(p2:P2)
        =fun(p3:P3)
        =this(p1,p2,p3)