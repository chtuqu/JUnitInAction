package com.chtuqu.junit_in_action.ch2;

import com.chtuqu.junit_in_action.ch1.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ParameterizedTestNoConstructor {

    @Parameterized.Parameter // 0 is the default value
    public double expected; // NOT private!
    @Parameterized.Parameter(1)
    public double valueOne; // NOT private!
    @Parameterized.Parameter(2)
    public double valueTwo; // NOT private!

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][] {
                {2, 1, 1},
                {3, 2, 1},
                {4, 3, 1}
        });
    }

    @Test
    public void sum() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(valueOne, valueTwo), 0);
    }

}
