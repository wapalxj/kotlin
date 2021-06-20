package xx.thread_05_.AQS

import xx.SleepTools
import java.util.concurrent.locks.Lock

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com
 *
 * 类说明：
 */
class TestMyLock {
    fun test() {
        // 启动4个子线程
        (0..3).forEach { _ ->
            Worker().start()
        }
        // 主线程每隔1秒换行
        (0..9).forEach { _ ->
            SleepTools.second(1)
            //println()
        }
    }
    val lock: Lock = SelfLock()
    inner class Worker : Thread() {
        override fun run() {
            lock.lock()
            println(currentThread().name)
            try {
                SleepTools.second(1)
            } finally {
                lock.unlock()
            }
        }
    }
    companion object {
        fun main(args: Array<String>) {
            val testMyLock = TestMyLock()
            testMyLock.test()
        }
    }
}