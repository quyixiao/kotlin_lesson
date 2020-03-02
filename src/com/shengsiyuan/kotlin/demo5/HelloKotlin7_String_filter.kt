package com.shengsiyuan.kotlin.demo5

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}



fun main(args: Array<String>) {
    println("aji9f98ds98".filter { it >= 'a' })
    println("aji9f98ds98".filter { it < 'a' })
    println("aAji9f9BN8ds98".filter { it.isLetter() })
}
