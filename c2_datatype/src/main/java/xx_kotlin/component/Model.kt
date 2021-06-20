package xx_kotlin.component

class Model(val id: Int, var name: String = "") {
    operator fun component1(): Int = id
    operator fun component2(): String = name
    operator fun component3(): String = "model"


}


fun main() {
    val model = Model(18, "vero")
    val (n1, n2, n3) = Model(model.id, model.name)
    println(n1)
    println(n2)
    println(n3)
}