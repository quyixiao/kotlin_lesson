package com.shengsiyuan.kotlin.demo9

// 注解是（annotation） 是每一个开发人员
// 注解可以通过一些元注解来描述
// 表示能够

@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION,
    AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER,AnnotationTarget.FIELD,AnnotationTarget.PROPERTY_GETTER
)

@Retention(AnnotationRetention.SOURCE)
annotation class MyAnnotation

@MyAnnotation
class MyClass {
    @MyAnnotation
    fun myMethond(@MyAnnotation a: Int): Int {
        return (@MyAnnotation 10)
    }
}

class MyClass2 @MyAnnotation constructor(a: Int) {

}


class MyClass3 {
    var a: Int? = null
        @MyAnnotation set
}

fun main(args: Array<String>) {

}