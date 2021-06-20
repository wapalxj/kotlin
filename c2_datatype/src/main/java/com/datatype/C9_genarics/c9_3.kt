package com.datatype.C9_genarics

import com.google.gson.Gson
import java.io.File

fun main(args: Array<String>) {

    val person=Person("vero",17)

    Gson().toJson(person).let{
        File("person.json").writeText(it)
    }

    val person1:Person=Gson().fromJson(File("person.json").readText())
    println(person1)

}

inline fun <reified T> genarics() {
    println(T::class.java)
}


data class Person(val name:String,val age:Int)

inline fun <reified T> Gson.fromJson(json:String):T=fromJson(json,T::class.java)