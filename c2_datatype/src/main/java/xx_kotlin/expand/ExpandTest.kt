package xx_kotlin.expand

fun main() {
    Data().display()
}

fun Data.display() {
    val res = type + 100
    println("Data.display $res")
}


class Data {
    var type: Int = 0
}