package org.calculator.proxy;

import org.calculator.calculator.Calculator;
import org.calculator.config.Operation;

public class ProfilerProxyCalculator implements Calculator<Integer> {
    Calculator<Integer> calculator;

    public ProfilerProxyCalculator(Calculator<Integer> calculator) {
        this.calculator = calculator;
    }

    @Override
    public Integer calculate(Operation operation, Integer... operands) {
        System.out.printf("   !!!ProfilerProxy: %s starts working!\n", operation);
        long startTime = System.currentTimeMillis();
        Integer result = calculator.calculate(operation, operands);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: %s was being executed for %d milliseconds\n", operation, time);
        return result;
    }

}
