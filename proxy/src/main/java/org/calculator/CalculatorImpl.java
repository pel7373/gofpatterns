package org.calculator;

public class CalculatorImpl implements Calculator {

    private final Calculator calculator;

    public CalculatorImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int sum(int a, int b) {
        return calculator.sum(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return calculator.multiply(a, b);
    }

    @Override
    public int divide(int a, int b) {
        return calculator.divide(a, b);
    }

}
