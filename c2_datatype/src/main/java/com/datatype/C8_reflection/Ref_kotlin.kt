package com.datatype.C8_reflection

import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberExtensionFunctions
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

fun main(args: Array<String>) {
    //获取kotlin class
    val person = Person("vero", 17)
    val kclazz = Person::class
    val kclazz2 = person::class
    val kclazz3 = person.javaClass.kotlin


//    kclazz2.constructors.forEach (::println)

    val primaryConstructor = kclazz.primaryConstructor
    val kPerson = primaryConstructor!!.call("vero", 188)
//    println(kPerson)

    //获取属性
//    kclazz2.memberProperties.forEach(::println)

    //获取某个属性
    kclazz.memberProperties.first {
        it.name == "name"
    }.get(kPerson).let {
//        println(it)
    }

    //设置var属性
    (kclazz.memberProperties.first {
        it.name == "age" } as? KMutableProperty1<Person,Int>)!!.set(kPerson,17)

//    println(kPerson)


    //获取fun
    kclazz.memberFunctions.forEach (::println)

    kclazz.memberFunctions.first { it.name=="say" }?.call(kPerson,"vnixxxxxxxxxxx")

    //获取扩展fun
    kclazz.memberExtensionFunctions.forEach (::println)

    //注解
    kclazz.annotations.forEach(::println)

    kclazz.memberProperties
            .first{it.name=="name"}
            .annotations
            .forEach(::println)




}