package com.xuzimian.java.learning.common.calculation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RemainderDemo {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void should_print_result_when_mod_two(int operand) {
        System.out.println(operand % 2);
    }
}
