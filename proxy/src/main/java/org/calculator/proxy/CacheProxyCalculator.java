package org.calculator.proxy;

import org.calculator.calculator.Calculator;
import org.calculator.config.Operation;
import org.calculator.exception.InvalidOperandException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CacheProxyCalculator implements Calculator<Integer> {
    Calculator<Integer> calculator;
    Map<Operand, Integer> cache = new HashMap<>();

    public CacheProxyCalculator(Calculator<Integer> calculator) {
        this.calculator = calculator;
    }

    @Override
    public Integer calculate(Operation operation, Integer... operands) {
        if(operands == null || operands.length < 2) {
            System.out.printf("   ##Cache can't work! It works only with two operands! Operation: %s\n", operation);
            return calculator.calculate(operation, operands);
        }

        int a = operands[0];
        int b = operands[1];
        Operand newOperand = new Operand(operation, a, b);
        if (cache.containsKey(newOperand)) {
            System.out.printf("   ##Cache: get from %s cache: %d %s %d = %d\n", operation, a, operation, b, cache.get(newOperand));
            return cache.get(newOperand);
        }

        int result = calculator.calculate(operation, operands);
        cache.put(newOperand, result);
        System.out.printf("   ##Cache: put to %s cache: %d %s %d = %d\n", operation, a, operation, b, result);

        return result;
    }

    class Operand {
        private final Operation operation;
        private final int a;
        private final int b;

        public Operand(Operation operation, int a, int b) {
            this.operation = operation;

            if(operation.isCommutative()) {
                this.a = Math.min(a, b);
                this.b = Math.max(a, b);
            } else {
                this.a = a;
                this.b = b;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Operand operand = (Operand) o;
            return a == operand.a && b == operand.b && operation == operand.operation;
        }

        @Override
        public int hashCode() {
            return Objects.hash(operation, a, b);
        }
    }
}
