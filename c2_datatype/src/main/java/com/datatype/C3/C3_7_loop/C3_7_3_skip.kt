package com.datatype.C3.C3_7_loop


class Student {
    fun isNotClothedProperly(): Boolean {
        return false
    }
}

fun main(args: Array<String>) {
    val students = ArrayList<Student>()
    val you = Student()

    for (student in students) {
        if (student == you) {
            continue
        }

        if (student.isNotClothedProperly()) {
            break
        }
    }
}