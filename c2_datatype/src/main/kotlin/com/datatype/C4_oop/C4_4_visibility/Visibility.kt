package com.datatype.C4_oop.C4_4_visibility

class House

class Flower

class Countryard {
    private val house: House = House()
    private val flower: Flower = Flower()
}

class ForbiddenCity {
    private val houses = arrayOf(House(), House())
    private val flowers = arrayOf(Flower(), Flower())

    internal val inter: Int = 0
}

fun main(args: Array<String>) {
    val countryard = Countryard()
    val fc = ForbiddenCity()
    println(countryard)
    println(fc.inter)
}