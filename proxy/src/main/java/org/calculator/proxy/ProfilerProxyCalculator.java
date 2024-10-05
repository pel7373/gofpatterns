package org.calculator.proxy;

public class ProfilerProxyCalculator implements ProxyCalculator {
    ProxyCalculator proxyCalculator;

    public ProfilerProxyCalculator(ProxyCalculator proxyCalculator) {
        this.proxyCalculator = proxyCalculator;
    }

    @Override
    public int sum(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = proxyCalculator.sum(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: sum was being executed for %d milliseconds\n", time);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = proxyCalculator.subtract(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: subtract was being executed for %d milliseconds\n", time);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = proxyCalculator.multiply(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: multiply was being executed for %d milliseconds\n", time);
        return result;
    }

    @Override
    public int divide(int a, int b) {
        long startTime = System.currentTimeMillis();
        int result = proxyCalculator.divide(a, b);
        long time = (System.currentTimeMillis() - startTime);
        System.out.printf("   !!!ProfilerProxy: divide was being executed for %d milliseconds\n", time);
        return result;
    }
}
