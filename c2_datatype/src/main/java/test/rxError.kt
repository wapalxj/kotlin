package test


fun main() {
    val str="VERO";
    val str2=str.toLowerCase()

    var ste :String?=null;
    val set=HashSet<String>()
    set.add("a111")
    set.add(ste?:"")
    println(str)
    println(str2)
    println(set)
}




fun bubbleSort(ia: IntArray) {
    var temp: Int
    ia.indices.forEach {
        
    }
    for (i in ia.indices) {
        for (j in 0 until ia.size - i-1) {
            if (ia[j] > ia[j + 1]) {
                temp = ia[j + 1]
                ia[j + 1] = ia[j]
                ia[j] = temp
            }
        }
    }
}











fun getFmUserId(wfcUserId: String?): Int {
    //uid_122344
    return wfcUserId?.removePrefix("uid_")?.parseToInt()?:0
}

fun String?.parseToInt(): Int {
    return try {
        this?.toInt() ?: 0
    } catch (e: Exception) {
//        e.printStackTrace()
        0
    }
}

