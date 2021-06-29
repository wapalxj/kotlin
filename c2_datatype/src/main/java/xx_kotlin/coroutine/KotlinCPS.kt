package xx_kotlin.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import java.net.ResponseCache
import kotlin.concurrent.thread

data class Item(val i: String = "itemVero")

fun main() {
    CallbackStyle().postItem(Item())
    Thread.sleep(5000)
}

class CallbackStyle {

    fun postItem(item: Item) {
        //非协程方式：
//        requestToken(object : Callback<String> {
//            override fun onResult(token: String) {
//                createPost(token, item, object : Callback<String> {
//                    override fun onResult(post: String) {
//                        processPost(post)
//                    }
//                })
//            }
//        })
        //协程方式：
        GlobalScope.launch {
            val token=requestToken()
            val post=createPost(token,item)
            processPost(post)
        }
    }

    //改造requestToken为suspend
    suspend fun requestToken(): String {
        return suspendCancellableCoroutine { con ->
            thread {
                print("start suspend request token ...")
                Thread.sleep(1000)
                println("... finish suspend request token")
                con.resumeWith(Result.success("token-suspend"))
            }
        }
    }

    //改造createPost为suspend
    suspend fun createPost(token: String, item: Item):String {
        return suspendCancellableCoroutine { con ->
            thread {
                print("start suspend create Post ...$token,${item.i}")
                Thread.sleep(1000)
                println("... finish suspend create Post")
                con.resumeWith(Result.success("Response-Post suspend"))
            }
        }
    }



    //非协程requestToken
    fun requestToken(callback: Callback<String>) {
        print("start request token ...")
        Thread.sleep(1000)
        println("... finish request token")
        callback.onResult("token")
    }

    //非协程createPost
    fun createPost(token: String, item: Item, callback: Callback<String>) {
        print("start create Post ...$token,${item.i}")
        Thread.sleep(1000)
        println("... finish create Post")
        callback.onResult("ResponsePost")
    }

    fun processPost(post: String) {
        println("process post,post=$post")
    }

    interface Callback<T> {
        fun onResult(value: T)
        fun onError(e: Exception) {}
    }
}