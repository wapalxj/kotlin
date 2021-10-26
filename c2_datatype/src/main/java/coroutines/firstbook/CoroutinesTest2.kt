package coroutines.firstbook

import kotlinx.coroutines.*


fun main() {
//    test1()
//    test2()
//    test3()
    test4()
}

private fun test1() {
    runBlocking {
        val result = async {
            println("5+1===")
            delay(2000)
            5 + 1
        }.await()
        println(result)
    }
}

private fun test2() {
    runBlocking {
        val start = System.currentTimeMillis()
        val result = async {
            delay(2000)
            5 + 1
        }.await()

        println("test2 result===11111111111111111111111")
        val result2 = async {
            delay(2000)
            5 + 5
        }.await()

        println("result===${result + result2}")
        println("result串行执行===${System.currentTimeMillis() - start}")
    }
}

private fun test3() {
    runBlocking {
        val start = System.currentTimeMillis()
        val deferred1 = async {
            delay(2000)
            5 + 1
        }

        val deferred2 = async {
            delay(2000)
            5 + 5
        }

        println("result===${deferred1.await() + deferred2.await()}")
        println("result并行执行===${System.currentTimeMillis() - start}")
    }
}



private fun test4() {
    runBlocking {
        val start = System.currentTimeMillis()
        val result= withContext(Dispatchers.IO){
            Thread.sleep(2000)
            5+1
        }

        val result2= withContext(Dispatchers.IO){
            delay(2000)
            5+3
        }
        println("result===${result+ result2}")
        println("result串行执行===${System.currentTimeMillis() - start}")
    }
}

