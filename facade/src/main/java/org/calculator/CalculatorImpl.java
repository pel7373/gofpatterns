package org.calculator;

public class CalculatorImpl implements Calculator {

    private final Calculator calculatorClient;

    public CalculatorImpl(Calculator calculatorClient) {
        this.calculatorClient = calculatorClient;
    }

    @Override
    public int sum(int a, int b) {
        return calculatorClient.sum(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return calculatorClient.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return calculatorClient.multiply(a, b);
    }

    @Override
    public int divide(int a, int b) {
        return calculatorClient.divide(a, b);
    }
}
