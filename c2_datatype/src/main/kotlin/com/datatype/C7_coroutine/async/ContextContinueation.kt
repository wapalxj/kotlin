package com.datatype.C7_coroutine.async

import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext

class ContextContinueation(override val context: CoroutineContext = EmptyCoroutineContext) : Continuation<Unit> {
    override fun resumeWithException(exception: Throwable) {

    }

    override fun resume(value: Unit) {

    }

}
