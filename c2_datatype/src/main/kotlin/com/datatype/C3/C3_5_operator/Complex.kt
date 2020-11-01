package com.datatype.C3.C3_5_operator


class Complex(var real: Double, var imaginary: Double) {
    // +
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    // +
    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    // +,只能有一个参数
//    operator fun plus(other: Int,a:Int): Complex {
//        return Complex(real + other, imaginary)
//    }

    //重载() 为取模
    operator fun invoke(): Double {
        return Math.hypot(real, imaginary);
    }

    override fun toString(): String {
        return "$real+${imaginary}i"
    }
}


fun main(args: Array<String>) {
    val c1 = Complex(3.0, 4.0)//3+4i
    val c2 = Complex(2.0, 7.5)//2+7.5i

    println(c1 + c2)//5.0+11.5i
    println(c1 + 5)//8.0+4.0i
    println(c1())//5.0
}