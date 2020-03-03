package com.shengsiyuan.kotlin.demo11


/***
 *  使用@JvFild 注解对 Kotlin 中的属性进行标时，表示它是一个实例字段（instance field）,Kotlin 编译器在处理的时候
 *  不会给这个字段生成 getter /setter
 */
class Person{
    var name: String  = "zhangsan"

    @JvmField
    var age :Int = 10




}