package com.shengsiyuan.kotlin.demo

open class MyParent {
    open var name: String = "parent"
}


class MyChild : MyParent() {
    override var name: String = "child" //如果是重写的话，一定要加上override
}


