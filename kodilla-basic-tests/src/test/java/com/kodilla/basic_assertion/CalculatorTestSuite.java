package com.kodilla.basic_assertion;

import com.kodilla.inheritance.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(-3, subtractResult);
    }
    public void testPower() {
        Calculator calculator = new Calculator();
        int c = 4;
        int d = 2;
        double delta;
        double powerResult = calculator.power(c,d);
        assertEquals(16, powerResult, 0.01);
    }
}
