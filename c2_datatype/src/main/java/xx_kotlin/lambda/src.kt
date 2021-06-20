package xx_kotlin.lambda

fun main() {
    val name="vnix"

    name.run {
        //run的返回值为这个lambda的返回值
    }

    name.apply {
        //apply的返回永远是this,即name的类型
    }

    name.let {
        //let的返回值为这个lambda的返回值
        10000
    }
    name.also {
        //apply的返回永远是this,即name的类型
    }


    name.myLet {

    }

//    println(letValue)

//    test1()
//    test2()
//    test3()
}

fun test1() {
    val name: String? = "vero"
    name?.myRun1<String, String>()
}

fun <T, R> T.myRun1() {
    println(this)
}


fun test2() {
    val name: String? = "vero"
    val res=name?.myRun2{
//        this//错误,m()并没有返回值
        200 //返回200
    }
    println(res)
}

//T.myRun2    :扩展函数myRun2()
//()->R       :匿名扩展函数
fun <T, R> T.myRun2(m:() -> R): R {
    return m() //myRun3的返回值即为m()的返回值,类型具体由调用者决定
}

//////////////////////////////////////////////////////////
fun testRun() {
    val name: String? = "vero"
    val res=name?.myRun2{
//        this//返回this
        200 //返回100
    }
    println(res)
}

//自定义run():
//T.myRun    :扩展函数myRun()
//T.()->R    :T的匿名扩展函数,参数当然为this
fun <T, R> T.myRun(m: T.() -> R): R {
    return m() //myRun的返回值即为m()的返回值,类型具体由调用者决定
}

//自定义apply():
//T.myApply  :扩展函数myApply()
//T.()->R    :T的匿名扩展函数,参数当然为this
fun <T> T.myApply(m: T.() -> Unit): T {
    m()
    return this //myRun的返回值即为T
}

//自定义let():
//T.myLet   :扩展函数myLet()
//(T)->R    :直接把T作为参数
fun <T, R> T.myLet(m: (T) -> R): R {
    return m(this) //myLet的返回值即为m()的返回值,类型具体由调用者决定
}











