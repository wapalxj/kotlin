package xx_kotlin.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.math.BigInteger
import java.util.*


private suspend fun foo() {
    log("mfoo start====${System.currentTimeMillis()}=====${Thread.currentThread().name}")
    //耗时操作
    val t = BigInteger.probablePrime(4096, Random())
    log("foo finish====$t")
    log("foo finish====${System.currentTimeMillis()}=====${Thread.currentThread().name}")
}


private suspend fun foo1() {
    withContext(Dispatchers.IO) {
        log("foo1 start====${System.currentTimeMillis()}=====${Thread.currentThread().name}")
        //耗时操作
        val t = BigInteger.probablePrime(4096, Random())
        log("foo1 finish====$t")
        log("foo1 finish====${System.currentTimeMillis()}=====${Thread.currentThread().name}")
    }
}

private suspend fun foo2() {
    GlobalScope.launch {
        withContext(Dispatchers.IO) {
            log("foo1 start====${System.currentTimeMillis()}=====${Thread.currentThread().name}")
            //耗时操作
            val t = BigInteger.probablePrime(4096, Random())
            log("foo1 finish====$t")
            log("foo1 finish====${System.currentTimeMillis()}=====${Thread.currentThread().name}")
        }
    }

}


suspend fun main() {
    log("main==before=foo()")
//    foo()//阻塞主线程
//    foo1()//阻塞主线程
    foo2()//不阻塞主线程
    log("main==after=foo()")
    Thread.sleep(10000)
}