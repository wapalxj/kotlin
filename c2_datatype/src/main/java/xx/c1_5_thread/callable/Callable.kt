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

    Thread.sleep(100)
    if (Random.nextInt(100)>80) {
        println("get============会阻塞在这里")
        println("get============${task.get()}")
    }else{
        task.cancel(true)
        println("cancel.....")
    }
}

class UserCallable : Callable<Int> {
    override fun call(): Int {
        println("start================")
        Thread.sleep(2000)
        val sum = (0..2000).sumBy {
            println("add============$it")
            it
        }
        println("end============$sum")
        return sum
    }
}