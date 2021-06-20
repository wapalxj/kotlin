package xx_kotlin.`class`

fun main() {

}

open class Person(id: Int) {
    constructor() : this(0)
    constructor(id: Int, name: String) : this(id)
}

class Student(id: Int) : Person(id) {
    var age: Int = 0
    lateinit var name: String
}