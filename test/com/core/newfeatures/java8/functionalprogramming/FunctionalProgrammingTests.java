package com.core.newfeatures.java8.functionalprogramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunctionalProgrammingTests {

    private Calculator calculator;
    private CalculatorImpl calculatorImpl;

    @BeforeEach
    public void setup() {
         calculatorImpl = new CalculatorImpl();
         calculator = calculatorImpl.getCalculator();
    }


    @Test
    public void add() {
        int result = calculatorImpl.add(calculator, 4, 8);
        assertEquals(12, result);
    }

    @Test
    public void substract() {
        int result = calculatorImpl.substract(calculator, 9, 6);
        assertEquals(3, result);
    }

    @Test
    public void multiply() {
        int result = calculatorImpl.multiply(calculator, 4, 8);
        assertEquals(32, result);
    }
}
