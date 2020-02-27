package com.shengsiyuan.kotlin.demo

class Person constructor(username: String) {
    private var username: String
    private var age: Int
    private var address: String

    init {
        this.username = username;
        this.age = 0
        this.address = "beijing"
    }

}
