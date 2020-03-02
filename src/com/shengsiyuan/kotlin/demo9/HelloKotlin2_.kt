@file:JvmName("HelloKotlin2")

package com.shengsiyuan.kotlin.demo9

import kotlin.reflect.KClass


// 注解也可以拥有自己的构造方法，并且构造方法也可以接收参数
/****
 * 与 Java原生类型所对应的类型（Int,Long...）
 * 字符串，：String
 * classes (MyClass::class)
 * 枚举：enums
 * 其他的注解
 * 上述类型的数组类型
 *
 * Kotlin 的注解参数是不允许可空类型的，因为 JVM 不支持以 null 的形式存储注解属性值的
 * 如果某个注解被用作其他的注解的参数，那么其名字就不需要以@字符开头
 *
 */

annotation class MyAnnotation2(val str: String)

annotation class MyAnnotation3(val str: String, val myAnnotation: MyAnnotation2)

@MyAnnotation2("hello")
class MyClass4 {

}

@MyAnnotation3("test", MyAnnotation2("welocome"))
class MyClass5

/***
 *  如果需要将某个 class 作为注解的参数，那么请使用 Kotlin class(KClass)
 *  Kotlin 编译器会自动将其转换为 Java Class
 *  这样，Java代码就可以正常看到注解也参数了
 */

annotation class MyAnnotation4(val args1: KClass<*>, val arg2: KClass<out Any>)

@MyAnnotation4(String::class, Int::class)
class MyClass6


//  注解使用处目标（use-site target ）

/****
 * 在对类的属性或者是主构造方法参数声明的注解时，会存在多个 java元素都可以通过对应的 Kotlin 元素生成出来
 * 因此，在所生成的 java字节码中，就会存在多个可能的位置来生成相应的注解。若想精确指定如何来生成注解，那么可以使用注解的使用处目标
 * 方式来实现
 *
 */


class MyClass7(
    @field:MyAnnotation val arg1: String,//  注解
    @get:MyAnnotation val arg2: String, // 注解 Java getter
    @param:MyAnnotation val arg3: String
) //注解 Java 构造方法参数












