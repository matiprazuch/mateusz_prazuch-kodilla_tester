package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test

    public void testSum() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        int subtractResult = calculator.subtract(a,b);
        int expResult = calculator.exponentiation(a);

        assertEquals(6, sumResult);
        assertEquals(-10, subtractResult);
        assertEquals(4, expResult);
    }
}
