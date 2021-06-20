package xx_kotlin

fun main() {
    //自定义标签
    mylab@ for (i in 1..5){
        for (i in 1..5){
            break@mylab
        }
    }
}

//自带标签@Vero
class Vero{
    val name="vero"
    fun show(){
        println(this.name)
        println(this@Vero.name)
    }
}