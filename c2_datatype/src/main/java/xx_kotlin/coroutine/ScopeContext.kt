package xx_kotlin.coroutine

import kotlinx.coroutines.*
import java.security.AccessControlContext
import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

fun main() {
    coroutineContestTest()
}

fun coroutineContestTest() {
    (CoroutineName("vero") + Dispatchers.IO).also {
        //true
        log("${it[CoroutineName] == CoroutineName("vero")}")
        //true
        log("${it[ContinuationInterceptor] == Dispatchers.IO}")

    }
}

fun test() {
    GlobalScope.launch {

    }
    val scope = CoroutineScope(Job() + Dispatchers.IO)
    scope.launch {

    }
}

fun CoroutineScope.test(context: CoroutineContext = EmptyCoroutineContext,
                        block: suspend CoroutineScope.() -> Unit): Job {

    return Job()
}