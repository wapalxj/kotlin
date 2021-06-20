package com.datatype.C4_oop.C4_2_Inheri

import com.sun.org.apache.bcel.internal.generic.DREM

interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

class Manager : Driver, Writer {
    override fun write() {

    }

    override fun drive() {

    }
}

//资深经理
//拥有司机和秘书
class SeniorManager1(val driver: Driver, val writer: Writer)
    : Driver, Writer {

    override fun drive() {
        driver.drive()
    }

    override fun write() {
        writer.write()
    }
}

//接口代理 by
class SeniorManager2(val driver: Driver, val writer: Writer)
    : Driver by driver, Writer by writer {

}

class CarDrive:Driver{
    override fun drive() {
        println("开车")
    }
}

class PPTWriter:Writer{
    override fun write() {
        println("写PPT")
    }

}

fun main(args: Array<String>) {
    val driver=CarDrive()
    val writer=PPTWriter()
    val seniorManager2 = SeniorManager2(driver,writer)
    seniorManager2.drive()
    seniorManager2.write()
}