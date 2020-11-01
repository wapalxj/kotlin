package com.datatype.C5_advance_function.C5_2_

fun main(args: Array<String>) {
    //取数字直到条件不满足，终止
    println((0..6).takeWhile { it ->
        it <= 3
    })

    println("-------let-------")
    val person = findPerson()
    println(person?.name)
    println(person?.age)

    //let替代上面的写法
    findPerson()?.let { (name, age) ->
        println(name)
        println(age)
    }

    findPerson()?.let { person ->
        person.work()
        println(person.name)
        println(person.age)
    }

    println("-------apply-------")

    //apply,是扩展方法
    findPerson()?.apply {
        work()
        println(name)
        println(age)
    }

    println("-------with-------")

    //with
    with(findPerson()){
        work()
        println(name)
    }

}

data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working")
    }
}

fun findPerson(): Person {
    return Person("vero", 18)
}
