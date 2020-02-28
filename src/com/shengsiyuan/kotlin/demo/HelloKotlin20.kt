package com.shengsiyuan.kotlin.demo

class ThePerson(address: String, name: String) {
    val age: Int
        get() = 20
    var address: String = address //如果没有定义，会默认的生成的 ,这个是初始化值，如果直接调用
        get() {
            println(" address get invoked")
            return field // 背后的指代的值
        }
        set(value) {
            println("set invoked ")
            field = value
        }
}

fun main(args: Array<String>) {
    var person = ThePerson("shanghai", "zhangsan")
    println(person.age) //内部是会调用他的get方法g
    println(person.address)
    person.address = "hangzhou"
    println(person.address)
}





