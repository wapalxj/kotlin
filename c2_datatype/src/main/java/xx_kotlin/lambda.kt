package xx_kotlin

fun main() {
    val add: (Int, Int) -> Int = { i1, i2 ->
        i1 + i2
    }
    println(add(1, 2))
    println(add2(1, 2))
}


val add2: (Int, Int) -> Int = { i1, i2 ->
    i1 + i2
}


val listener: ((Int, Int) -> Int)? = null