package com.datatype.C7_coroutine.async

import javax.swing.SwingUtilities
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext

/**
 * UI线程切换工具类，UIContinuation包装类
 */
class UIContinuationWrapper<T>(val continuation: Continuation<T>) : Continuation<T> {

    override val context = continuation.context

    override fun resume(value: T) {
        //线程切换
        SwingUtilities.invokeLater { continuation.resume(value) }
    }

    override fun resumeWithException(exception: Throwable) {
        //线程切换
        SwingUtilities.invokeLater { continuation.resumeWithException(exception) }
    }
}