package test

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class Dispose {
    var observable: Observable<String>?=null
    var disposable:Disposable ?=null
    var observer: Observer<String>?=null

    fun test(){
        if (observer == null) {
            observer = object : Observer<String> {
                override fun onSubscribe(d: Disposable?) {
                    disposable = d
                    println("onSubscribeonSubscribe")
                }

                override fun onNext(t: String?) {
                    println("onNextonNextonNext")
                }

                override fun onError(e: Throwable?) {
                }

                override fun onComplete() {
                }

            }

            println("1111111111111111")
        }
        println("222222222222")
        disposable?.dispose()
        if (observable == null) {
            observable=Observable.just("")
            println("33333333")
        }
        observable?.subscribe(observer)
    }
}

fun main() {
    val d=Dispose()
    d.test()
    d.test()
    d.test()
}