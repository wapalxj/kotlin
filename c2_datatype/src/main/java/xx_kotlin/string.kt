package xx_kotlin

fun main(args: Array<String>) {
    val info="""
        111111111
        222222222
        333333333
        444444444
    """   //前置空格

    val info2="""
        111111111
        222222222
        333333333
        444444444
    """.trimIndent()//删除空格

    val info3="""
        |111111111
        |222222222
        |333333333
        |444444444
    """.trimMargin()//删除空格和 |

    println(info)
    println(info2)
    println(info3)
}