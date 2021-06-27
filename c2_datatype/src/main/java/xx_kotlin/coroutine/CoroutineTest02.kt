package xx_kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.CoroutineContext.Element
import kotlin.coroutines.CoroutineContext.Key


fun main() {
//    coroutineContextTest()
//    coroutineContextTest1()
    start()
    Thread.sleep(2000)
}

fun coroutineContextTest() {
    val coroutineContext = Job() + Dispatchers.Default + CoroutineName("veroContext")
    log("$coroutineContext,${coroutineContext[CoroutineName]}")

    val newCoroutineContext = coroutineContext.minusKey(CoroutineName)
    log("$newCoroutineContext")

}


fun coroutineContextTest1() {
    val coroutineContext = Dispatchers.Default + CoroutineName("veroContext")
    log("$coroutineContext,${coroutineContext[CoroutineName]}")

    val newCoroutineContext = coroutineContext + Dispatchers.IO
    log("$newCoroutineContext")

}

private fun start() {
    log("start======")
    val launchJob = GlobalScope.launch(context = Dispatchers.IO,start = CoroutineStart.LAZY) {
        log("launch 启动一个协程")
    }
    //lazy:start才启动
    launchJob.start()
    log("launchJob==$launchJob")
}

//    public suspend fun <R> coroutineScope(block: suspend CoroutineScope.() -> R): R {
//        contract {
//            callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//        }
//        return suspendCoroutineUninterceptedOrReturn { uCont ->
//            val coroutine = ScopeCoroutine(uCont.context, uCont)
//            coroutine.startUndispatchedOrReturn(coroutine, block)
//        }
//    }