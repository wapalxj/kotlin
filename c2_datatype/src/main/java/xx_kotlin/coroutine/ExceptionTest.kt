package xx_kotlin.coroutine

import kotlinx.coroutines.*
import java.io.File
import java.io.FileInputStream

fun main() {
//    test1()
//    test01()
//    test02()
    test03()


    val scope=MainScope()//主从作用域
    scope.launch {
        //这里不是主从作用域
        //这里是主从作用域的子作用域--协同作用域
        //即：这里是协同作用域
        //下面2个协程异常会互相影响

        launch {
            //协程1
        }

        launch {
            //协程2
        }
    }


    Thread.sleep(20 * 1000)
}


/**
 * 另外一种方式的主从作用域
 * with(CoroutineScope(coroutineContext + SupervisorJob))
 *
 */
fun test03() = runBlocking {
    val job = SupervisorJob()//导致下面为 主从作用域
//    val job = Job()//导致下面为 协同作用域
    with(CoroutineScope(coroutineContext + job)) {
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


//主从作用域下的异常
fun test02() = runBlocking {
    log("test02 start=====================")
    val handlerException = CoroutineExceptionHandler { _, e ->
        log("test02 e==${e}")
    }
    try {
        GlobalScope.launch(handlerException) {
//        GlobalScope.launch() {//全局handler测试
            supervisorScope {
                //主从作用域
                log("test02 000000000000")
                launch {
                    //协程1
                    for (i in 0..20) {
                        delay(500)
                        log("test02 i===$i")
                    }
                }

                launch {
                    //这个协程异常，不会影响协程1
                    log("test02  ===readFile")
                    delay(2000)
                    readFile()
                    log("test02  ===readFile end=======")
                }

                log("test02 111111111111")
            }

        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    Thread.sleep(50 * 1000)
    log("test0 end=====================")
}


//协同作用域下的异常
fun test01() = runBlocking {
    log("test01 start=====================")
    val handlerException = CoroutineExceptionHandler { _, e ->
        log("test01 e==${e}")
    }
    try {
        //主从
        GlobalScope.launch(handlerException) {
            log("test01 000000000000")
            launch {
                //协程1
                for (i in 0..20) {
                    delay(500)
                    log("test01 i===$i")
                }
            }
            launch {
                //这个协程异常，会导致协程1也取消
                log("test01  ===readFile")
                delay(2000)
                readFile()
                log("test01  ===readFile end=======")
            }

            log("test01 111111111111")
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    Thread.sleep(50 * 1000)
    log("test0 end=====================")
}


fun test1() = runBlocking {
    log("test1 start=====================")
    val deferred = GlobalScope.async {
        log("test1 000000000000")
        readFile()
        log("test1 111111111111")
    }

    //这里带出异常
    try {
        deferred.await()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    log("test1 end=====================")
}

fun test0() = runBlocking {
    log("test0 start=====================")
    val handlerException = CoroutineExceptionHandler { _, e ->
        log("test0 e==${e}")
    }
    try {
        GlobalScope.launch(handlerException) {
            log("test0 000000000000")
            readFile()
            log("test0 111111111111")
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    log("test0 end=====================")
}

fun readFile() {
    val fis = FileInputStream(File(""))
    fis.read()
}