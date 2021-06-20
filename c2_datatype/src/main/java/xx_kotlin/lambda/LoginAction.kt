package xx_kotlin.lambda

fun main() {
    login("vero","111111"){
        println(it)
    }
    login("vero","123456"){
        println(it)
    }
}

private fun login(name: String, pwd: String, response: (Boolean) -> Unit) {
    response(name=="vero" && pwd=="123456")
}


