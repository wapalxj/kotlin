package xx_kotlin.kt
fun main() {
//    val in=10//报错
    val `in`=10
    println(`in`)
    show()
    display()
    `display`()
    `12345`()
    ` `()
}
fun show() {
    println("show()")
}

//java代码调用不到了：
fun ` `(){
    println("内部是空格")
}
//java代码调用不到了：
fun `12345`(){
    println("12345")
}
//java代码可调用
fun `display`() {
    println("display()")
}



