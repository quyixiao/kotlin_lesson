package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    println(convert2Int("ab"))
    printMultiply("2", "4")
    printMultiply2("2", "a")
}


fun convert2Int(str: String): Int? { //Int 加一个？表示结果可能为空
    try {
        return str.toInt()
    } catch (e: Exception) {

    } finally {

    }
    return null
}


fun printMultiply(a: String, b: String) {
    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)
    if (null != a2Int && null != b2Int) {
        println(a2Int * b2Int)
    }

}


fun printMultiply2(a: String, b: String) {
    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)
    //println(a2Int * b2Int) 因为可能是空值，可能是空值
    if (null == a2Int) {
        println("params not int")
    } else if (null == b2Int) {
        println("params not int")
    } else {
        println(a2Int * b2Int)
    }


}