package org.calculator;

public class CalculatorImpl implements Calculator {

    private final Calculator calculatorImpl;

    public CalculatorImpl(Calculator calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    @Override
    public int sum(int a, int b) {
        return calculatorImpl.sum(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return calculatorImpl.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return calculatorImpl.multiply(a, b);
    }

    @Override
    public int divide(int a, int b) {
        return calculatorImpl.divide(a, b);
    }

}
