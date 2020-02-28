package com.shengsiyuan.kotlin.demo2
// 在Kotlin中 out, in
class ParameterizedClass<A>(private val value: A) {
    fun getValue(): A {
        return this.value
    }
}

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return this.value
    }
}


class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("hello world")
    var result = parameterizedClass.getValue()
    println(result)

    println("===========================")
    val parameterizedProducer = ParameterizedProducer("welcome")
    val myRef: ParameterizedProducer<Any> = parameterizedProducer
    println(myRef.get())
    println(myRef is ParameterizedProducer<Any>)

    println("--------------------------")
    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2 :ParameterizedConsumer<Int> = parameterizedConsumer
    println(myRef2 is ParameterizedConsumer)

}