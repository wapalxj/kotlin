package xx.c1_5_thread.callable

import java.util.concurrent.Callable
import java.util.concurrent.Future
import java.util.concurrent.FutureTask
import java.util.concurrent.RunnableFuture
import kotlin.random.Random

fun main() {
    val callable = UserCallable()
    val task = FutureTask(callable)
    Thread(task).start()

    if (Random.nextInt(100) > 80) {
        println("get============会阻塞在这里")
        println("get============${task.get()}")
    } else {
        println("cancel.....")
        task.cancel(true)
    }
    Thread.sleep(2000)
}

class UserCallable : Callable<Int> {
    private var sum = 0
    override fun call(): Int {
        println("start================")
//        try {
//            Thread.sleep(2000)//可以测试cancel()的中断
//        } catch (e: Exception) {
//            e.printStackTrace()
//            println("Exception================${e.message}")
//        }
//


        for (i in 0..2000) {
            if (Thread.currentThread().isInterrupted) {
                //kotlin 测试流程正常，但是这里不打印???
                println("Callable====线程中断")
                Thread.sleep(2000)
                return -1
            }
            sum += i
            println("add============$i")
            Thread.sleep(1)
        }
        println("end============$sum")
        return sum
    }
}