package xx_kotlin.coroutine

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlin.coroutines.CoroutineContext

class GlobalHandler : CoroutineExceptionHandler {
    override val key: CoroutineContext.Key<*>
        get() = CoroutineExceptionHandler

    override fun handleException(context: CoroutineContext,
                                 exception: Throwable) {
        Thread.setDefaultUncaughtExceptionHandler { t, e ->
            //设置，让异常不崩溃

        }

        log("GlobalHandler e== ${exception.localizedMessage}")
    }

}