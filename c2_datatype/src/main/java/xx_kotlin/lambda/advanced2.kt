package xx_kotlin.lambda

fun main() {
    ktRun {
        println("ktRun==${Thread.currentThread()}")
    }
}

fun ktRun(start: Boolean = true, mm: () -> Unit): Thread {
    return Thread {
        mm()
    }.apply {
        if (start) {
            start()
        }
    }
}