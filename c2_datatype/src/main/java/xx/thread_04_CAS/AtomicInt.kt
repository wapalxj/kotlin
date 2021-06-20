package xx.thread_04_CAS

import java.util.concurrent.atomic.AtomicInteger

class AtomicInt {
}

val ai = AtomicInteger(10)
fun main() {
    val i1 = ai.getAndIncrement()
    val i2 = ai.incrementAndGet()
    println("i1==$i1,i2==$i2")
//    ai.addAndGet(delta)
//    ai.getAndAdd(delta)
}