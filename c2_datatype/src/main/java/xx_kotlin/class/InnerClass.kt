package xx_kotlin.`class`

class OutClass {
    val i = 1

    //嵌套类，非内部类
    class InnerClass {
        fun show() {
            //非内部类，获取不到i
//            println(i)
        }
    }

    //内部类
    inner class InnerClass2 {
        fun show() {
            println(i)
        }
    }
}










