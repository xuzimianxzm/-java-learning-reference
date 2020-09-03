package com.xuzimian.java.learning.kotlin.grammar

val `lambda expression` = { int: Int -> println(int) }

fun `lambda expression function body`(int: Int) = { println(int) }

fun `lambda expression function body derive`(int: Int): () -> Unit {
    return { println(int) }
}


fun main() {
    `lambda expression`(0)

    `lambda expression function body`(1)
    `lambda expression function body`(2).invoke()
    `lambda expression function body`(3)()

    `lambda expression function body derive`(4)
    `lambda expression function body derive`(5).invoke()
    `lambda expression function body derive`(6)();

    { string: String -> println(string) }("自运行的lambda语法")
}



