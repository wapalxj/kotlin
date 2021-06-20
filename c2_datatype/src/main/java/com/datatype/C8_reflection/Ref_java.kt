package com.datatype.C8_reflection

import com.datatype.C4_oop.annotation.AnotherAnno
import com.datatype.C4_oop.annotation.PoKo

//访问的是kotlin字节码

@PoKo//生成默认无参构造注解
data class Person(@AnotherAnno val name:String, var age:Int){
    fun say(name: String){
        println(name)
    }

    fun sayHi(){
        println("hi")
    }

    //扩展方法
    fun Person.sayInnerHello(){
        println("inner hello")
    }

}

class DefaultConstructor()

//扩展方法
fun Person.sayHello(){
    println("hello")
}

//包级方法
fun sayHello(){
    println("sayHello")
}


fun main(args: Array<String>) {
    val clazz=Person::class.java
    val person=Person("vero",18)
    val clazz2=person.javaClass
    val clazz3=Person::class.java

    val defaultConstructor=DefaultConstructor::class.java.newInstance()

    val person2=
            clazz2
            .getConstructor(String::class.java,Int::class.java)
            .newInstance("vero",18)
//    val person2=clazz2.newInstance()

    //访问对象
    println(person2)

    //访问属性
    val name=clazz2
            .getDeclaredField("name")
            .apply {
                isAccessible=true
            }
            .set(person2,"vvvvv")//修改名字
//            .get(person2)
    println(person2)

    //访问方法
    val name2=clazz2
            .getDeclaredMethod("getName")
            .invoke(person2)
    println(name2)

    //访问方法
    val name3=clazz2
            .getDeclaredMethod("copy",String::class.java,Int::class.java)
            .invoke(person2,"vnix",19)
    println(name3)

    //访问扩展方法
    person2.sayHello()
    Class.forName("com.datatype.C8_reflection.ReflectionsKt")
//            .getDeclaredMethod("sayHello",Person::class.java)
//            .invoke(null,person2)

            //访问包级方法
            .getDeclaredMethod("sayHello")
            .invoke(null)

    //访问注解
    clazz.getAnnotation(PoKo::class.java).let (::println)

    //访问属性注解
    clazz.getDeclaredField("name")
            .apply {
                isAccessible=true
            }
            .annotations.forEach {
                    println(it)
           }



}