package com.shengsiyuan.kotlin.demo

class ThePerson(address: String, name: String) {
    val age: Int
        get() = 20

}

fun main(args: Array<String>) {
    var person = ThePerson("shanghai", "zhangsan")
    println(person.age) //内部是会调用他的get方法g
}





