package com.datatype.C7_coroutine.async

import com.datatype.C7_coroutine.common.HttpError
import com.datatype.C7_coroutine.common.HttpService
import com.datatype.C7_coroutine.common.log
import com.datatype.C7_coroutine.ui.LOGO_URL
import retrofit2.HttpException
import retrofit2.Retrofit
import java.net.URL
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * 异步下载
 */
fun startCoroutine(context: CoroutineContext=EmptyCoroutineContext,block: suspend () -> Unit) {
    //使用context切换线程
//    block.startCoroutine(ContextContinueation(AsyncContext()))
    block.startCoroutine(ContextContinueation(context+(AsyncContext())))
}


//封装 耗时操作方法
suspend fun <T> haoshi(block: () -> T) = suspendCoroutine<T> { continuation ->
    log("耗时操作，下载图片")
    AsyncTask {
        try {
            continuation.resume(block())
        } catch (e: Exception) {
            continuation.resumeWithException(e)
        }
    }.execute()
}

suspend fun <T> haoshi2(block: CoroutineContext.() -> T) = suspendCoroutine<T> { continuation ->
    log("耗时操作，下载图片")
    AsyncTask {
        try {
            continuation.resume(block(continuation.context))
        } catch (e: Exception) {
            continuation.resumeWithException(e)
        }
    }.execute()
}

//下载图片逻辑
fun startPic2(url: String): ByteArray {
    val response = HttpService.service.getLogo(url).execute()
    if (response.isSuccessful) {
        response.body()?.byteStream()?.readBytes()?.let {
            return it
        }
        throw HttpException(response)
    } else {
        throw HttpException(response)
    }
}


suspend fun startPic(url: String) = suspendCoroutine<ByteArray> { continuation ->
    log("耗时操作，下载图片")
    AsyncTask {
        try {
            val response = HttpService.service.getLogo(url).execute()
            if (response.isSuccessful) {
                response.body()?.byteStream()?.readBytes()?.let(
                        continuation::resume
                )
            } else {
                continuation.resumeWithException(HttpException(response))
            }
        } catch (e: Exception) {
            continuation.resumeWithException(e)
        }
    }.execute()
}