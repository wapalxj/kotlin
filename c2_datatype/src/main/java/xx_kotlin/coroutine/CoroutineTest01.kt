package xx_kotlin.coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

fun main() {
//    start()
//    start1()
//    start2()
    start3()


    Thread.sleep(3000)
}

private fun start() {
    log("start")

    runBlocking {
        delay(2000)
        log("runBlocking启动一个协程")
        //会阻塞所在线程
    }

    GlobalScope.launch {
        delay(2000)
        log("GlobalScope.launch启动一个协程")
        //不会阻塞所在线程
        //default 运行在一个随机线程
    }

    GlobalScope.async {
        delay(2000)
        log("GlobalScope.async启动一个协程")
        //不会阻塞所在线程
        //default 运行在一个随机线程
    }
}


//返回值
fun start1() {
    log("start1111111")
    val runBlockingJob = runBlocking {
        delay(2000)
        log("runBlocking启动一个协程")
        //会阻塞所在线程
    }

    log("runBlocking============= $runBlockingJob")

    val launchJob = GlobalScope.launch {
        delay(2000)
        log("GlobalScope.launch启动一个协程")
    }
    log("launchJob============= $launchJob")


    val asyncJob = GlobalScope.async {
        delay(2000)
        log("GlobalScope.async启动一个协程")
    }

    log("asyncJob============= $asyncJob")
}

//返回值2
fun start2() = runBlocking {
    log("start2222222222")
    val runBlockingJob = runBlocking {
        delay(2000)
        log("runBlocking启动一个协程")
        //会阻塞所在线程
    }

    log("runBlocking============= $runBlockingJob")

    val launchJob = GlobalScope.launch {
        delay(2000)
        log("GlobalScope.launch启动一个协程")
    }
    log("launchJob============= $launchJob")


    val asyncJob = GlobalScope.async {
        delay(2000)
        log("GlobalScope.async启动一个协程")
        "asyncJob return"
    }

    log("asyncJob await============= ${asyncJob.await()}")
    log("asyncJob============= $asyncJob")

    "runBlocking return"
}

fun start3() {
    //方式1 CoroutineScope()方法
    val scope = CoroutineScope(EmptyCoroutineContext)
    scope.launch {
        val def = async {
            "start3 async"
        }.await()

        log("asyncJob await============= $def")
    }

    //方式2 实现CoroutineScope接口
    class MyCoroutineScope() :CoroutineScope{
        override val coroutineContext: CoroutineContext
            get() = EmptyCoroutineContext
    }

    val myScope=MyCoroutineScope()
    myScope.async {
        log("MyCoroutineScope=====")
    }

}

