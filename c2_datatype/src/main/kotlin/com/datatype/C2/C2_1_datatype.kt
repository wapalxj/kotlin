package com.datatype.C2


//boolean
val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

//int
val aInt: Int = 8
val anotherInt: Int = 0xff
val moreInt: Int = 0b0011
val maxInt: Int = Int.MAX_VALUE

//long
val aLong: Long = 123456L
val anotherLong: Long = 123
val maxLong: Long = Long.MAX_VALUE

//float
val aFloat:Float=2.0f
val anotherFloat:Float=1E3f
val maxFloat:Float= Float.MAX_VALUE
//最小的Float(正数)
//val minFloat:Float= Float.MIN_VALUE
//最小的负数Float
val minFloat:Float= -Float.MAX_VALUE


//double
val aDouble :Double=1.0
val maxDouble :Double= Double.MAX_VALUE
//最小的Float(正数)
//val minDouble:Double= Double.MIN_VALUE
//最小的负数Float
val minDouble:Double= -Double.MAX_VALUE


//char
val aChar:Char='0'
val bChar:Char='大'
val cChar:Char='\u000f'


fun main(args: Array<String>) {
    println("boolean==" + aBoolean)
    println("maxLong==" + maxLong)
    println("maxFloat==" + maxFloat)
    println("0.0F/0.0F==" + 0.0F/0.0F)
    println("0.0F/0.0F==" + maxDouble)
    println("0.0F/0.0F==" + minDouble)


}