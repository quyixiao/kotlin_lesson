package com.shengsiyuan.kotlin.demo

class Person constructor(username: String) {
    private var username: String
    private var age: Int
    private var address: String

    init {
        println("111111111111      " )
        this.username = username;
        this.age = 0
        this.address = "beijing"
    }

    constructor(username: String, age: Int) : this(username) {
        println("2222222222222222222      " )
        this.username = username
        this.age = age
        this.address = "beijing"
    }

    // three 构造方法
    constructor(username: String, age: Int, address: String) : this(username, age) {
        println("3333333333333333      " )
        this.username = username
        this.age = age
        this.address = address
    }

    fun printInfo() {
        println("username : ${this.username} ,age = ${this.age} , address = ${this.address}")
    }
}


fun main(args: Array<String>) {
    var person = Person("zhangsan")
    var person2 = Person("lisi", 30)
    var person3 = Person("wangwu", 30, "hangzhou")

    person.printInfo()
    person2.printInfo()
    person3.printInfo()


}