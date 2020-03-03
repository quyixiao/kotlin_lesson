package com.shengsiyuan.kotlin.demo11

/****
 * 在 Kotlin 中，我们可以将具名对象或是将伴生对象中定义的函数注解为@JvmStatic，这样编译器在相应对象的类中生成相应对象的静态方法
 * 也会在对象自身生成实例方法
 */
class MyClass2 {
    companion object {
        fun test1() {
            println("test1")
        }


        @JvmStatic
        fun test2() {
            println("test2")
        }
    }

}