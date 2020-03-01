package com.shengsiyuan.kotlin.demo4

import kotlin.reflect.KProperty

class dge<T>(t: T) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }
}

class ResourceLoader<T>(id: Int) {
    operator fun provideDelegate(thisRef: MyUI, prop: KProperty<*>): dge<T?> {
        var flag = checkProperty(thisRef, prop.name)


        // 创建委托
        var t: T? = null
        return dge(t)
    }

    private fun checkProperty(thisRef: MyUI, name: String): Boolean {
        println("1111111111" + name)
        if ("image".equals(name)) {
            return true
        }
        return false
    }
}

class MyUI {
    val image by ResourceLoader<String>(1)
    val text by ResourceLoader<String>(2)
}

fun main(args: Array<String>) {
    val myui: MyUI = MyUI()
    println(myui.image)
    println(myui.text)
}