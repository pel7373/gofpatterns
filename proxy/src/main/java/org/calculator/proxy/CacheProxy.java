package org.calculator.proxy;

import org.calculator.Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CacheProxy implements Calculator {

    Calculator calculator;
    Map<SortedOperand, Integer> cacheSum = new HashMap<>();
    Map<Operand, Integer> cacheSubtract = new HashMap<>();
    Map<SortedOperand, Integer> cacheMultiply = new HashMap<>();
    Map<Operand, Integer> cacheDivide = new HashMap<>();

    public CacheProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int sum(int a, int b) {
        SortedOperand newSortedOperand = new SortedOperand(a, b);
        if(cacheSum.containsKey(newSortedOperand)) {
            System.out.printf("   ##Cache: get sum from cache: %d + %d = %d\n", a, b, cacheSum.get(newSortedOperand));
            return cacheSum.get(newSortedOperand);
        }

        int sum = calculator.sum(a, b);
        cacheSum.put(newSortedOperand, sum);
        System.out.printf("   ##Cache: put sum to cache: %d + %d = %d\n", a, b, cacheSum.get(newSortedOperand));

        return sum;
    }

    @Override
    public int subtract(int a, int b) {
        Operand newOperand = new Operand(a, b);
        if(cacheSubtract.containsKey(newOperand)) {
            System.out.printf("   ##Cache: get subtract from cache: %d - %d = %d\n", a, b, cacheSubtract.get(newOperand));
            return cacheSubtract.get(newOperand);
        }

        int subtract = calculator.subtract(a, b);
        cacheSubtract.put(newOperand, subtract);
        System.out.printf("   ##Cache: put subtract to cache: %d - %d = %d\n", a, b, cacheSubtract.get(newOperand));

        return subtract;
    }

    @Override
    public int multiply(int a, int b) {
        SortedOperand newSortedOperand = new SortedOperand(a, b);
        if(cacheMultiply.containsKey(newSortedOperand)) {
            System.out.printf("   ##Cache: get multiply from cache: %d * %d = %d\n", a, b, cacheMultiply.get(newSortedOperand));
            return cacheMultiply.get(newSortedOperand);
        }

        int multiply = calculator.multiply(a, b);
        cacheMultiply.put(newSortedOperand, multiply);
        System.out.printf("   ##Cache: put multiply to cache: %d * %d = %d\n", a, b, cacheMultiply.get(newSortedOperand));

        return multiply;
    }

    @Override
    public int divide(int a, int b) {
        Operand newOperand = new Operand(a, b);
        if(cacheDivide.containsKey(newOperand)) {
            System.out.printf("   ##Cache: get divide from cache: %d / %d = %d\n", a, b, cacheDivide.get(newOperand));
            return cacheDivide.get(newOperand);
        }

        int subtract = calculator.divide(a, b);
        cacheDivide.put(newOperand, subtract);
        System.out.printf("   ##Cache: put divide to cache: %d / %d = %d\n", a, b, cacheDivide.get(newOperand));

        return subtract;
    }

    class Operand {
        private int a;
        private int b;

        public Operand(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Operand operand = (Operand) o;
            return a == operand.a && b == operand.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    class SortedOperand {
        private int a;
        private int b;

        public SortedOperand(int a, int b) {
            this.a = Math.min(a, b);
            this.b = Math.max(a, b);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SortedOperand sortedOperand = (SortedOperand) o;
            return a == sortedOperand.a && b == sortedOperand.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}
