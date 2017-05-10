package com.chtuqu.junit_in_action.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitCalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(50, 10);
        assertEquals(60, result, 0);
    }

}
