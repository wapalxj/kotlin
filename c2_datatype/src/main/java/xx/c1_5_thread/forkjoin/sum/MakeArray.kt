package xx.c1_5_thread.forkjoin.sum

import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.absoluteValue


object MakeArray {
    const val ARRAY_LENGTH: Int = 40000000
    const val THRESHOLD: Int = 47

    fun makeArray(): IntArray {
        var result = IntArray(ARRAY_LENGTH)
        val r = Random()
        for (index in 0 until ARRAY_LENGTH) {
            //随机数
            result[index] = r.nextInt(THRESHOLD * 3).absoluteValue
        }
        return result
    }
    fun ms(seconds: Int) {
        try {
            TimeUnit.MILLISECONDS.sleep(seconds.toLong())
        } catch (e: InterruptedException) {
        }
    }
}