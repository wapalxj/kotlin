package com.datatype.C7_coroutine.async

import java.net.URL
import kotlin.coroutines.experimental.AbstractCoroutineContextElement
import kotlin.coroutines.experimental.CoroutineContext

//从context获取url
class DownloadContext(val url: String) : AbstractCoroutineContextElement(Key) {
    companion object Key : CoroutineContext.Key<DownloadContext>
}