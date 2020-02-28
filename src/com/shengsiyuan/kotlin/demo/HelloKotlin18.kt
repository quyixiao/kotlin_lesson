package com.shengsiyuan.kotlin.demo


open class BaseClass {
    open fun method() {

    }
}


abstract class ChildClass : BaseClass() {
    override abstract fun method()
}


