package com.datatype.C4_oop.C4_10_dataClass

import com.datatype.C4_oop.annotation.PoKo


@PoKo//插件注解
data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
    //region Description
    val china = Country(0, "中国")
    println(china)

    //component n 表示属性
    println(china.component1())//id
    println(china.component2())//name

    //withIndex返回的IndexedValue是一个dataClass
    for ((index, value) in args.withIndex()) {

    }
    //endregion

    //查看字节码，其实调用component n()
    val (id, name) = china
    println(id)
    println(name)


    val componentX=ComponentX()
    val(a,b,c,d)=componentX
    println("$a$b$c$d")
}

class ComponentX {
    operator fun component1(): String {
        return "hello,i am"
    }

    operator fun component2(): Int {
        return 1
    }

    operator fun component3(): Int {
        return 1
    }

    operator fun component4(): Int {
        return 0
    }
}