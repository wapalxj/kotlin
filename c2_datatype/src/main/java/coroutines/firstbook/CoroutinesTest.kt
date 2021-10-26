package coroutines.firstbook

import kotlinx.coroutines.*


fun main() {
//    test2()
//    test3()
    test4()
//    test5()
}

private fun test1(){
    GlobalScope.launch {
        println("code launch launch")
    }
    Thread.sleep(1000)
}

private fun test2(){
    GlobalScope.launch {
        println("code launch launch")
        delay(1500)
        println("code launch ffffffffffffffff")
    }
    Thread.sleep(1000)
}

private fun test3(){
    runBlocking {
        launch {
            println("code launch11111111111")
            delay(1000)
            println("code launch11111111111 ffffffffffffffff")
        }

        launch {
            println("code launch11111111111")
            delay(1000)
            println("code launch11111111111 ffffffffffffffff")
        }
    }
}

suspend fun printDog()= coroutineScope {
    launch {
        println(".")
        delay(1000)
    }
}

private fun test4() {
    runBlocking {
        //阻塞当前线程，子协程
        coroutineScope {
            //阻塞子协程
            launch {
                (1..10).forEach {
                    println(it)
                    delay(1000)
                }
            }
            launch {
                (11..20).forEach {
                    println(it)
                    delay(1000)
                }
            }
            println("coroutineScope 00000000000")
        }
        println("coroutineScope 1111111")
    }
    println("runBlocking 22222222222")
}

private fun test5(){
    val job=Job()
    val scope= CoroutineScope(job)
    scope.launch {
        println("CoroutineScope")
    }
    Thread.sleep(1000)
//    scope.cancel()
}