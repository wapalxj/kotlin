package coroutines.coroutines

import org.joda.time.DateTime
import java.text.SimpleDateFormat
import java.util.*


val xdf =SimpleDateFormat("HH:mm:ss:SSS")
fun log(msg: Any) {
    println("${xdf.format(Date())} [${Thread.currentThread().name}]  $msg")
}