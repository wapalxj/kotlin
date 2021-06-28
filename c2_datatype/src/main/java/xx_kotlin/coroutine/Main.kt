package xx_kotlin.coroutine

import kotlinx.coroutines.*


fun main() {
    Test().test()
    Thread.sleep(20 * 1000)
}

//正确使用方式
class Test : CoroutineScope by MainScope() {
    fun test() {
        log("test03 000000000000")
        launch {
            //协程1
            for (i in 0..20) {
                delay(500)
                log("test03 i===$i")
            }
        }

        launch {
            //这个协程异常，不会影响协程1
            log("test03  ===readFile")
            delay(2000)
            readFile()
            log("test03  ===readFile end=======")
        }
        log("test03 111111111111")
    }
}

//错误使用方式
class Test2 {
    val scope = MainScope()
    fun test() {
        log("test03 000000000000")
        scope.launch {
            //scope的儿子作用域
            launch {
                //孙子作用域===协程1
                for (i in 0..20) {
                    delay(500)
                    log("test03 i===$i")
                }
            }

            launch {
                //孙子作用域===2  这个协程异常，会影响协程1
                log("test03  ===readFile")
                delay(2000)
                readFile()
                log("test03  ===readFile end=======")
            }
            log("test03 111111111111")
        }

    }
}

