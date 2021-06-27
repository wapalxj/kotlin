package xx_kotlin.generic

val parentClass = ParentClass()
val childClass = ChildClass()

fun test01() {

    //out :向外拿的，获取
    //out 只能获取，不能修改   ? extend ParentClass
    val list: MutableList<out ParentClass> = ArrayList<ChildClass>()

    //in :向内放的，修改
    //in 只能修改，不能获取   ? super ChildClass
    val inList: MutableList<in ChildClass> = ArrayList<ParentClass>()


}


