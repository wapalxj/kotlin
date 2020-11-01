package com.datatype.C3.C3_4_setter_getter

fun main(args: Array<String>) {

}

class A{
    var b=0

//    protected get //改变访问级别的简写
//    protected set //改变访问级别的简写

    get() {
        println("get b")
        return field
    }
    protected set(value) {
        println("set b")
        field=value
    }

    lateinit var c:String//表示后面再近些初始化
    lateinit var d:X//表示后面再进行初始化

//    lateinit val e:X //error 只能作用在var

    val e:X by lazy {
        //访问的时候再初始化
        println("set X")
        X()
    }

}

class X