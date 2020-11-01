package com.datatype.C4_oop.C4_12_enum

enum class LogLevel {
    VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT
}

enum class LogLeve2(val id: Int) {
    VERBOSE(0),
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    ASSERT(5);//kotlin 唯一需要强制写分号的地方,实例和方法分隔开

    fun getTag(): String {
        return "$id,$name"
    }

    override fun toString(): String {
        return "$id-->$name-->$ordinal"
    }
}

class LgoLevel3 protected constructor() {
    companion object {
        val VERBOSE = LgoLevel3()
        val DEBUG = LgoLevel3()
        val INFO = LgoLevel3()
        val WARN = LgoLevel3()
        val ERROR = LgoLevel3()
        val ASSERT = LgoLevel3()
    }
}

fun main(args: Array<String>) {
    println(LogLeve2.VERBOSE.getTag())
    println(LogLeve2.DEBUG.ordinal)//顺序序号

    LogLeve2.values().map(::println)

    //通过名字拿到实例
    println(LogLeve2.valueOf("ERROR"))

}