package com.xuzimian.java.learning.kotlin.grammar

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class LambdaExpression {

    @Test
    fun lambdaExpressionDemo() {
        val lambdaExpression = { int: Int -> println(int) }

        lambdaExpression(0)
    }

    @Test
    fun lambdaExpressionFunctionBodyDemo() {
        fun lambdaExpressionFunctionBody(int: Int) = { println(int) }

        lambdaExpressionFunctionBody(1)
        lambdaExpressionFunctionBody(2).invoke()
        lambdaExpressionFunctionBody(3)()
    }

    @Test
    fun lambdaExpressionFunctionBodyDerive1Demo() {
        fun lambdaExpressionFunctionBodyDerive1(int: Int) = { -> println(int) }

        lambdaExpressionFunctionBodyDerive1(4)
        lambdaExpressionFunctionBodyDerive1(5).invoke()
    }

    @Test
    fun lambdaExpressionFunctionBodyDerive2Demo() {
        fun lambdaExpressionFunctionBodyDerive2(int: Int): () -> Unit {
            return { println(int) }
        }

        lambdaExpressionFunctionBodyDerive2(6)
        lambdaExpressionFunctionBodyDerive2(7).invoke()
        lambdaExpressionFunctionBodyDerive2(8)();
    }

    @Test
    fun selfRunningLambdaDemo() {
        { string: String -> println(string) }("自运行的lambda语法")
    }
}

/**
 * 柯里化函数
 */
class CurringFunction {

    @Test
    fun curryingSumFunctionDemo() {
        fun sum(x: Int) = { y: Int ->
            { z: Int -> x + y + z }
        }

        assertEquals(6, sum(1)(2)(3))
    }

    /**
     * 最后一个参数是函数类型时，可以采用柯里化风格调用
     */
    @Test
    fun curringLikeDemo() {
        fun curringLike(content: String, apply: (String) -> Unit) {
            apply(content)
        }

        curringLike("look like curring style") { content ->
            println(content)
        }
    }
}

/**
 * 中缀函数
 */
class InfixFunction {

    @Test
    fun mapToDemo() {
        val numberMap = mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
        )

        assertEquals(
            mapOf(
                1.to("one"),
                2.to("two"),
                3.to("three")
            ), numberMap
        )
    }
}

