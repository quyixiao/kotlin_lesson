package com.shengsiyuan.kotlin.demo3

/****
 * Kotlin访问外部类变量的方式 ：this@OuterClass.str
 * Java访问外部类的变量访问方式：OuterClass.this.str
 * 
 */
class Person(val name: String, var age: Int) {

    private val str: String = "Person属性"

    private inner class PersonFeature(var hight: Int, var weight: Int) {

        private val str: String = "PersonFeature 属性"

        fun getPersonFeature() {
            val str: String = "局部变量"
            println("身高：$hight ,体重 $weight")
            println("${this@Person.str}")
            println("${this.str}")
            println(str)
            this@Person.method()

        }
    }

    private fun method() {
        println("执行了person的method方法")
    }

    fun getPerson() {
        val personFeature = PersonFeature(120, 180)
        personFeature.getPersonFeature()
    }
}


fun main(args: Array<String>) {
    var person = Person("Zhangsan", 20)
    person.getPerson()

}