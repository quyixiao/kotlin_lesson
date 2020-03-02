package com.shengsiyuan.kotlin.demo11;

/***
 * 属性(properties）
 * 一个 Kotlin 属性会被编译为3部分 java 元素
 * 1.一个 getter 方法
 * 2.一个 setter 方法
 * 3.一个私有的字段（field）,其名字与 Kotlin 的属性名一样
 *
 *
 */

class Test {
    var name: String = "zhangsan"

}