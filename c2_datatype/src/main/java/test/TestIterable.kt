package test

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.CountDownLatch
import kotlin.concurrent.thread

fun main() {
    val list = listOf(0, 1, 2, 3, 4, 5)

    val newList = list.filter {
        it >= 1
    }
    val t = System.currentTimeMillis()
//    Observable.fromIterable(newList)
//            .flatMap {
//                val countDownLatch = CountDownLatch(1)
//                if (it %2 ==0) {
//                    thread {
//                        Thread.sleep(1000)
//                        countDownLatch.countDown()
//                    }
//                }else{
//                    thread {
//                        Thread.sleep(1000)
//                        countDownLatch.countDown()
//                    }
//                }
//                countDownLatch.await()
//                Observable.just("")
//            }
//            .subscribeOn(Schedulers.io())
//            .toList()
//            .subscribe {
//                println("00000000====${System.currentTimeMillis() - t}")
//            }



    test(null)
    while (true){

    }
}

fun test(p:Pair<String,String>?){
    if (p?.first?.length==2) {
        println("00000000=======")
    }else{
        println("111111=======")
    }
}