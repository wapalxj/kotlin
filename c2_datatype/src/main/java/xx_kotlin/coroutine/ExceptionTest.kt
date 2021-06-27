package xx_kotlin.coroutine

import kotlinx.coroutines.*
import java.io.File
import java.io.FileInputStream

fun main() {
    test01()
//    test1()
    Thread.sleep(2000)
}


fun test01() = runBlocking{
    log("test01 start=====================")
    val handlerException= CoroutineExceptionHandler { _, e ->
        log("test01 e==${e}")
    }
    try {

        //主从
        val job = SupervisorJob()
        val scope= CoroutineScope()
        GlobalScope.launch(job+handlerException) {
            log("test01 000000000000")
            launch {
                //协程1
                for (i in 0..100){
                    delay(500)
                    log("test01 i===$i")
                }
            }
            launch {
                //这个协程异常，会导致协程1也取消
                readFile()
            }
            log("test01 111111111111")
        }
    }catch (e: Exception){
        e.printStackTrace()
    }
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

fun test0() = runBlocking{
    log("test0 start=====================")
    val handlerException= CoroutineExceptionHandler { _, e ->
        log("test0 e==${e}")
    }
    try {
        GlobalScope.launch(handlerException) {
            log("test0 000000000000")
            readFile()
            log("test0 111111111111")
        }
    }catch (e: Exception){
        e.printStackTrace()
    }
    log("test0 end=====================")
}

fun readFile() {
    val fis = FileInputStream(File(""))
    fis.read()
}