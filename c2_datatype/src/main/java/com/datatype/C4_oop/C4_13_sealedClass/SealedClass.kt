package com.datatype.C4_oop.C4_13_sealedClass

sealed class PlayerCmd {
    class Play(val url: String, val position: Long = 0) : PlayerCmd()
    class Seek(val position: Long = 0) : PlayerCmd()


    object Pause : PlayerCmd()
    object Resume : PlayerCmd()
    object Stop : PlayerCmd()
}


enum class PlayerState {
    IDLE, PAUSE, PLAYING
}