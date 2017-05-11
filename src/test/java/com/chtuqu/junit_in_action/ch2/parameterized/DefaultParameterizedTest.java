package com.chtuqu.junit_in_action.ch2.parameterized;

import com.chtuqu.junit_in_action.ch1.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class) // required
public class DefaultParameterizedTest {

    // instance variables must be required
    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() { // signature must be @Parameters public static Collection with no arguments, name can be different
        return Arrays.asList(new Integer[][] { // Collection elements must be arrays of identical length
                {2, 1, 1}, // the array length must match the number of arguments of the constructor
                {3, 2, 1},
                {4, 3, 1}
        });
    }

    public DefaultParameterizedTest(double expected, double valueOne, double valueTwo) { // required; must be the only public constructor
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(valueOne, valueTwo), 0);
    }
}
