package com.datatype.C4_oop.C4_5_object

class Driver

interface OnExternalDriverMountListener {
    fun onMount(driver: Driver)
    fun onUnMount(driver: Driver)
}

abstract class Player


object MusicPlayer :Player(),OnExternalDriverMountListener{
    override fun onUnMount(driver: Driver) {

    }

    override fun onMount(driver: Driver) {

    }

    val state: Int = 0
    fun play(url: String) {

    }
}

fun main(args: Array<String>) {

}