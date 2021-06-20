package xx.thread_05_

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

/**
 * 类说明：使用Lock的范例
 */
class LockCase {
    val lock: Lock = ReentrantLock()
    var age = 100000 //初始100000

    class TestThread(private val lockCase: LockCase,
                             name: String?) : Thread(name) {
        override fun run() {
            for (i in 0..99999) { //递增100000
                lockCase.test()
            }
            println(currentThread().name + " age =  " + lockCase.age)
        }

    }

    fun test() {
        lock.lock()
        try {
            age++
        } finally {
            lock.unlock()
        }
    }

    fun test2() {
        lock.lock()
        try {
            age--
        } finally {
            lock.unlock()
        }
    }
}

@Throws(InterruptedException::class)
fun main() {
    val lockCase = LockCase()
    val endThread: Thread = LockCase.TestThread(lockCase, "endThread")
    endThread.start()
    for (i in 0..99999) { //递减100000
        lockCase.test2()
    }
    println(Thread.currentThread().name
            + " age =  " + lockCase.age)
}

