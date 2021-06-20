package xx_kotlin

fun main() {

    val nums= arrayOf(1,2,3)

//    val nums2=Array(20, {1})//元素默认值为1
    val nums2=Array(20) { index:Int -> index}
    nums2.forEach {
        println(it)
    }


}