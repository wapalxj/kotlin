package xx.c1_5_thread.forkjoin.sum

import java.util.concurrent.ForkJoinPool

fun main() {
    val src = MakeArray.makeArray()
    //普通的求和方法
    sumNormal(src)
    //fork join的求和方法
    sumByForkJoin(src)
}

fun sumByForkJoin(src:IntArray) {
    //pool
    val pool = ForkJoinPool()
    val sumTask = SumTask(src, 0, src.size - 1)
    val start=System.currentTimeMillis()
    pool.invoke(sumTask)
    println("sumByForkJoin--The count is ${sumTask.join()} spend time ${System.currentTimeMillis() - start}ms")

}

fun sumNormal(src:IntArray) {
    val start = System.currentTimeMillis()
    var count=0L
    for (i in src.indices) {
        //添加休眠，和fork-join差距更大
        MakeArray.ms(1)
        count = count + src[i]
    }
    println("sumNormal--The count is $count spend time ${System.currentTimeMillis() - start}ms")

}