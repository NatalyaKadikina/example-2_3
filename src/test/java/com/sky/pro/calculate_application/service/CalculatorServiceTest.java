package com.sky.pro.calculate_application.service;

import com.sky.pro.calculate_application.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static com.sky.pro.calculate_application.service.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        int result = calculatorService.pluse(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        int result = calculatorService.pluse(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    public void shouldReturnOneWhenMinusTwoAndOne() {
        int result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReturnZeroWhenMinusOneAndOne() {
        int result = calculatorService.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyOneAndOne() {
        int result = calculatorService.multiply(ONE, TWO);
        assertEquals(ONE * TWO, result);
    }

    @Test
    public void shouldReturnOneWhenMultiplyOneAndOne() {
        int result = calculatorService.multiply(ONE, ONE);
        assertEquals(ONE * ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        int result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

    @Test
    public void shouldReturnOneWhenDivideOneAndOne() {
        int result = calculatorService.divide(ONE, ONE);
        assertEquals(ONE / ONE, result);
    }

    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(ONE, ZERO));
    }
}