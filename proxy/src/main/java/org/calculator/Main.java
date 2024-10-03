package org.calculator;

import org.calculator.proxy.CacheProxy;
import org.calculator.proxy.ProfilerProxy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
    CommandLineRunner lookup(CalculatorClient calculator) {
        return args -> {
			Calculator calculatorProfilerProxy = new ProfilerProxy(new CacheProxy(new CalculatorImpl(calculator)));
        	int result;
        	result = calculatorProfilerProxy.sum(3, 5);
        	System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.sum(3, 5);
			System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.sum(5, 3);
			System.out.println("The result is : "+ result);

			System.out.println();
        	result = calculatorProfilerProxy.subtract(15,10);
        	System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.subtract(15,10);
			System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.subtract(10,15);
			System.out.println("The result is : "+ result);

			System.out.println();
			result = calculatorProfilerProxy.multiply(15,10);
			System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.multiply(10,15);
			System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.multiply(10,15);
			System.out.println("The result is : "+ result);

			System.out.println();
			result = calculatorProfilerProxy.divide(10,5);
			System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.divide(10,5);
			System.out.println("The result is : "+ result);
			result = calculatorProfilerProxy.divide(5,10);
			System.out.println("The result is : "+ result);
        };
    }

}
