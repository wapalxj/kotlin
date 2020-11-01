package com.datatype.C4_oop.C4_9_delegate

import kotlin.reflect.KProperty

class Delegates {
    val hello by lazy {
        "vero"
    }

    val hello2 by X()
    var hello3 by X()
}

class X {
    private var value: String? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue: $thisRef -> ${property.name}")
        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("setValue: $thisRef -> ${property.name} =$value")
        this.value = value
    }
}

fun main(args: Array<String>) {
    val delegates=Delegates()
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
    delegates.hello3="value hello3"
}