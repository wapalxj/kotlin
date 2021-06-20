package com.datatype.C6_DSL

fun main(args: Array<String>) {

}

class Tag(val name: String) : Node {

    val children = ArrayList<Node>()
    val properties = HashMap<String, String>()
    override fun render(): String {
        StringBuilder()
                .append("<")
                .append(name)
                .append("<")
        return ""
    }
}