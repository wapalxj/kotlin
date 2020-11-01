package com.datatype.C7_coroutine.basic

import com.datatype.C7_coroutine.async.AsyncTask
import com.datatype.C7_coroutine.common.HttpError
import com.datatype.C7_coroutine.common.HttpService
import com.datatype.C7_coroutine.common.log
import com.datatype.C7_coroutine.ui.LOGO_URL
import retrofit2.HttpException
import retrofit2.Retrofit
import java.net.URL
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * 同步下载
 */
fun startCoroutine(block: suspend () -> Unit) {
    block.startCoroutine(BaseContinueation())
}

suspend fun startPic(url: String) = suspendCoroutine<ByteArray> { continuation ->
    log("耗时操作，下载图片")
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

}