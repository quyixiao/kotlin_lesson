package com.shengsiyuan.kotlin.demo2

/****
 * Kotlin：声明处协变，Java中，使用处协变
 * Kotlin中的out关键字叫做variance annotation，因为它是类型参数声明处所指定的，因此我们称为声明处协变（declaration-site variance）
 * 对于java来说则是使用处协变（use-site variance）,其中类型通配符使用的类型协变成为可能
 * 如果泛型类只是将泛型类型作为其方法的输出类型(返回类型)，那么我们就可以使用out
 * product = output = out
 * 从中get
 ***/

interface Producer<out T> {
    fun produce(): T
}

/**
 * 从中set
 * 如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in
 * consumer = input = in
 */
interface Consumer<in T> {
    fun consumer(item: T)
}

/***
 * 如果泛型的类，同时将泛型类型作为其方法的输入类型与输出类型，那么我们就将这个类型称为中间类型
 */
interface ProducerConsumer<T> {
    fun product(): T
    fun consumer(item: T)
}


open class Fruit

open class Apple : Fruit()

open class ApplePear : Apple()

class FruitProducer : Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")
        return Fruit()
    }
}

class AppleProducer : Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")
        return Apple()
    }
}

class ApplePearProducer : Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("Produce ApplePear")
        return ApplePear()
    }
}


class Human : Consumer<Fruit> {
    override fun consumer(item: Fruit) {
        println("consumer Fruit")
    }

}


class Man : Consumer<Apple> {
    override fun consumer(item: Apple) {
        println("Consume Apple")
    }
}


class Boy : Consumer<ApplePear> {
    override fun consumer(item: ApplePear) {
        println("Consume ApplePear")
    }

}

fun main(args: Array<String>) {
    // 对于out 泛型来说，我们可以将子类型的对象赋值给父类型的引用
    val producer1: Producer<Fruit> = FruitProducer()
    val a = producer1.produce()
    println(a)

    val producer2: Producer<Fruit> = AppleProducer()
    val b = producer2.produce()
    println(b)

    val producer3: Producer<Fruit> = ApplePearProducer()
    val c = producer3.produce()
    println(c)

    // 对于in来说来说，我们可心讲父类型对象赋值给子类型引用
    println("========================")
    val consumer1: Consumer<Fruit> = Human()
    var e = Fruit()
    var f = Apple()
    var g = ApplePear()
    consumer1.consumer(g)
    val consumer2: Consumer<Apple> = Man()
    consumer2.consumer(f)
    val consumer3: Consumer<ApplePear> = Boy()
    consumer3.consumer(g)

}






