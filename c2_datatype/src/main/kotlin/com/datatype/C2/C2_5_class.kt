package com.datatype.C2

import com.datatype.C4_oop.annotation.PoKo
import com.sun.istack.internal.Interned

class Meizi(xingge: String,
            zhangxiang: String,
            voice: String) : Human(xingge, zhangxiang, voice) {
    fun sing(singName:String){
        //唱歌的具体实现
        println("singing")
    }
    fun dance(danceName:String){
        //跳舞的具体实现
        println("dancing")
    }
}

open class Human(var xingge: String,
                 var zhangxiang: String,
                 var voice: String) {
    init {
        //构造方法体
        println("new 了一个 ${this.javaClass.simpleName},$xingge,$zhangxiang,$voice")
    }
}





//如果主构造函数没有任何注解或者可见性修饰符，
// 可以省略 constructor 关键字
class Person constructor(){

}

//如果构造函数有注解或可见性修饰符，constructor 关键字是必需的
class Person2  private constructor(){

}

annotation class Vero

class Person3 @Vero constructor(){

}

fun main(args: Array<String>) {
    val aMeizi: Meizi = Meizi("温柔", "甜美", "动人")
//    println(aMeizi is Human)
    aMeizi.sing("哈哈哈")
    aMeizi.dance("天鹅湖")
}
