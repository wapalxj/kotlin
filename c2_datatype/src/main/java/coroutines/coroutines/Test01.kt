package coroutines.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

suspend fun main() {
    log(1)
    val job = GlobalScope.launch {
        log(2)
    }
    log(3)
    log(Testss.name)
    job.join()
    log(4)
}

class Testss{
   companion object YAO{
       val name="YAO"
   }
}