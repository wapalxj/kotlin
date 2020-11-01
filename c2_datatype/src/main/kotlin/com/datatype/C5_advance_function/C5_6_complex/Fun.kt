package com.datatype.C5_advance_function.C5_6_complex

//f(g(x))   m(x)=f(g(x))


val add5 = { i: Int ->
    i + 5
}

val multi = { i: Int ->
    i * 2
}

fun main(args: Array<String>) {
    println(multi(add5(8)))//(5+8)*2

    val add5AndMulti2 = add5 andThen multi
    val add5ComposeMulti2 = add5 compose multi


    println(add5AndMulti2(8))//f(g(x))   (5+8)*2
    println(add5ComposeMulti2(8))//g(f(x))  5+8*2
}

//P1,P2为参数，R为返回
infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
    return fun(p1: P1): R {
        return function.invoke(this.invoke(p1))
    }
}

infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
    return fun(p1: P1): R {
        return this.invoke(function.invoke(p1))
    }
}