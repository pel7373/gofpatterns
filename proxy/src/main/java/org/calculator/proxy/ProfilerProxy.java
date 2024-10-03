package org.calculator.proxy;

import org.calculator.Calculator;

public class ProfilerProxy implements Calculator {
    Calculator calculator;

    public ProfilerProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int sum(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = calculator.sum(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: sum was being executed for %d milliseconds\n", time);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = calculator.subtract(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: subtract was being executed for %d milliseconds\n", time);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = calculator.multiply(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: multiply was being executed for %d milliseconds\n", time);
        return result;
    }

    @Override
    public int divide(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = calculator.divide(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: divide was being executed for %d milliseconds\n", time);
        return result;
    }
}
