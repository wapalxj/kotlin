package xx.thread_04_CAS

import java.util.concurrent.atomic.AtomicStampedReference

/**
 * 类说明：演示带版本戳的原子操作类
 */
object UseAtomicStampedReference {
    var asr = AtomicStampedReference("vero", 0)

    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        //拿到当前版本号(旧)
        val oldStamp = asr.stamp
        val oldReference = asr.reference
        println("$oldReference============$oldStamp")

        val rightStampThread = Thread(Runnable {
            println(Thread.currentThread().name + ":当前变量值：" + oldReference + "-当前版本戳：" + oldStamp + "-"
                    + asr.compareAndSet(oldReference, "$oldReference Java", oldStamp, oldStamp + 1))

        })
        val errorStampThread = Thread(Runnable {
            val reference= asr.reference
            //compareAndSet：更新失败返回false
            println(Thread.currentThread().name +":当前变量值："
                    +reference + "-当前版本戳：" + asr.stamp + "-"
                    + asr.compareAndSet(reference, "$reference C", oldStamp, oldStamp + 1))
        })
        rightStampThread.start()
        rightStampThread.join()
        errorStampThread.start()
        errorStampThread.join()

        println(asr.reference +"============"+asr.stamp)
    }
}