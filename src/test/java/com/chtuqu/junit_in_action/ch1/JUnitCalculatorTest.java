package com.chtuqu.junit_in_action.ch1;

import org.junit.Test;

import static org.junit.Assert.assertEquals; // Assert class or its methods are typically statically imported

public class JUnitCalculatorTest { // test class must be public and contain a zero-argument constructor

    @Test // test method must be annotated with @Test, ...
    public void testAdd() { // ... be public, take no arguments and return void
        Calculator calculator = new Calculator();
        double result = calculator.add(50, 10);
        assertEquals(60, result, 0); // expected, actual
    }

}
