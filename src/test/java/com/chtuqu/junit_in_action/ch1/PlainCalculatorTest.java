package com.chtuqu.junit_in_action.ch1;

public class PlainCalculatorTest {

    private int nbErrors = 0;

    public static void main(String[] args) {
        PlainCalculatorTest test = new PlainCalculatorTest();

        try {
            test.testAdd();
        } catch (Exception e) {
            test.nbErrors++;
            e.printStackTrace();
        }

        try {
            test.testMultiply();
        } catch (Exception e) {
            test.nbErrors++;
            e.printStackTrace();
        }

        if (test.nbErrors > 0) {
            throw new IllegalStateException("There were " + test.nbErrors + " error(s)");
        }
    }

    private void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(50, 10);
        if (result != 60) {
            throw new IllegalStateException("Bad result: " + result);
        }
    }

    private void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(3, 7);
        if (result != 21) {
            throw new IllegalStateException("Bad result: " + result);
        }
    }
}
