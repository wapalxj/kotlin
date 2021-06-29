package xx_kotlin.coroutine


private suspend fun foo(): Int {
    return 1
}

suspend fun main() {
    val i= foo()
}