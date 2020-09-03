package com.xuzimian.java.learning.kotlin.grammar

fun lambdaExpressionFunctionBody(int: Int) = { println(int) }

fun lambdaExpressionFunctionBodyActual(int: Int): () -> Unit {
    return { println(int) };
}

fun foo1(int: Int) = { x: Int -> println(x) }

fun main() {
    lambdaExpressionFunctionBody(1).invoke()
    lambdaExpressionFunctionBodyActual(2).invoke()
}