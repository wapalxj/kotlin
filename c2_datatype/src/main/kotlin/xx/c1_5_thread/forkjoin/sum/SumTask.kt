package xx.c1_5_thread.forkjoin.sum

import java.util.concurrent.RecursiveTask


class SumTask(val src: IntArray = intArrayOf(),
              val fromIndex: Int = 0,
              val toIndex: Int = 0) : RecursiveTask<Long>() {

    companion object {
        //阈值
        const val THRESHOLD = MakeArray.ARRAY_LENGTH / 10
    }

    override fun compute(): Long {
        if (toIndex - fromIndex < THRESHOLD) {
//            println("from index =$fromIndex,toIndex=${toIndex}")

            var count = 0L
            for (index in fromIndex..toIndex) {
//                MakeArray.ms(1)
                count += src[index]
            }
            return count
        } else {
            //折半拆分
            //fromIndex....mid....toIndex
            val mid = fromIndex / 2 + toIndex / 2
            val taskLeft = SumTask(src, fromIndex, mid)
            val taskRight = SumTask(src, mid + 1, toIndex)
            invokeAll(taskLeft,taskRight)
            return taskLeft.join() + taskRight.join()
        }
    }
}