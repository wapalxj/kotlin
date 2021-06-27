package xx_kotlin.coroutine

import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf

val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

inline fun Long.date(): String = sdf.format(this)
inline fun isAndroid() = try {
//    Build.VERSION.SDK_INT!=0
    false
} catch (e: Exception) {
    false
}

fun log(msg: String) = if (isAndroid()) {

} else {
    println("[${System.currentTimeMillis().date()}]-[${Thread.currentThread().name}]==$msg")
}