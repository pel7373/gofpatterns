package org.calculator;

import org.calculator.proxy.CacheProxyCalculator;
import org.calculator.proxy.ProfilerProxyCalculator;
import org.calculator.proxy.ProxyCalculator;
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
    CommandLineRunner lookup(CalculatorClient calculatorClient) {
        return args -> {
			Calculator calculator = new ProfilerProxyCalculator(new CacheProxyCalculator(new CalculatorImpl(calculatorClient)));
        	int result;
        	result = calculator.sum(3, 5);
        	System.out.println("The result is : "+ result);
			result = calculator.sum(3, 5);
			System.out.println("The result is : "+ result);
			result = calculator.sum(5, 3);
			System.out.println("The result is : "+ result);

			System.out.println();
        	result = calculator.subtract(15,10);
        	System.out.println("The result is : "+ result);
			result = calculator.subtract(15,10);
			System.out.println("The result is : "+ result);
			result = calculator.subtract(10,15);
			System.out.println("The result is : "+ result);

			System.out.println();
			result = calculator.multiply(15,10);
			System.out.println("The result is : "+ result);
			result = calculator.multiply(10,15);
			System.out.println("The result is : "+ result);
			result = calculator.multiply(10,15);
			System.out.println("The result is : "+ result);

			System.out.println();
			result = calculator.divide(10,5);
			System.out.println("The result is : "+ result);
			result = calculator.divide(10,5);
			System.out.println("The result is : "+ result);
			result = calculator.divide(5,10);
			System.out.println("The result is : "+ result);
        };
    }

}
