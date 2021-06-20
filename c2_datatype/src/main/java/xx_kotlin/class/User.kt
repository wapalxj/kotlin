package xx_kotlin.`class`

fun main() {
    val user=User(18,"vero","m")
    val userCopy=user.copy()

    val (cId,cName,cSex) = user.copy()

    val (cId2,_,cSex2) = user.copy()

    println(userCopy)
    println("cid==$cId cName==$cName cSex==$cSex")
    println("cid==$cId2  cSex==$cSex2")
}
data class User(val id: Int,
                val name: String,
                val sex: String
)








