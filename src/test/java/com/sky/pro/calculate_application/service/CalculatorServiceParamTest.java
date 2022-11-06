package com.sky.pro.calculate_application.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.sky.pro.calculate_application.service.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParamTest {
    private CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public  void shouldSumCorrectly(int a, int b) {
        int result = calculatorService.pluse(a, b);
        assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public  void shouldMinusCorrectly(int a, int b) {
        int result = calculatorService.minus(a, b);
        assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public  void shouldMultiplyCorrectly(int a, int b) {
        int result = calculatorService.multiply(a, b);
        assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public  void shouldDivideCorrectly(int a, int b) {
        int result = calculatorService.divide(a, b);
        assertEquals(a / b, result);
    }

    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(ZERO, THREE)
        );
    }

}
