package xx_kotlin.lambda

fun main() {
    //声明，但没有实现,不能调用，调用报错
    var method01: () -> Unit

    //声明，但没有实现,不能调用，调用报错
    var method001: (Int) -> Int?

    //实现
    var method02: (Int) -> Int = {
        it
    }
    println(method02(100))

    ///////////////////////
    var add: (Int, Int) -> Int = { i1, i2 ->
        i1 + i2
    }
    println(add(1, 2))


    var add02 = { i1: Int, i2: Int ->
        i1 + i2
    }

    println(add02(10, 2))


    ////////////////////////////////////

    //覆盖
    var m14 = { num: Int ->
        println("====m14==$num")
    }
    m14 = {
        println("====m14 2222222==$it")
    }
    m14(100)

    ////////////////////////////////////

    run {

    }
}


private fun login(name: String, pwd: String, request: (String, String) -> Unit) {
    request(name, pwd)
}

typealias RequestLogin = (String, String) -> Unit

private fun login2(userName: String, password: String, request: RequestLogin) {
    request(userName, password)
}