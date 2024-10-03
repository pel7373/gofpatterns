package org.calculator;

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
			Calculator calculatorProxy = new CacheProxy(new CalculatorImpl(calculator));
        	int result;
        	result = calculatorProxy.sum(3, 5);
        	System.out.println("The result is : "+ result);
			result = calculatorProxy.sum(3, 5);
			System.out.println("The result is : "+ result);
			result = calculatorProxy.sum(5, 3);
			System.out.println("The result is : "+ result);

			System.out.println();
        	result = calculatorProxy.subtract(15,10);
        	System.out.println("The result is : "+ result);
			result = calculatorProxy.subtract(15,10);
			System.out.println("The result is : "+ result);
			result = calculatorProxy.subtract(10,15);
			System.out.println("The result is : "+ result);

			System.out.println();
			result = calculatorProxy.multiply(15,10);
			System.out.println("The result is : "+ result);
			result = calculatorProxy.multiply(10,15);
			System.out.println("The result is : "+ result);
			result = calculatorProxy.multiply(10,15);
			System.out.println("The result is : "+ result);

			System.out.println();
			result = calculatorProxy.divide(10,5);
			System.out.println("The result is : "+ result);
			result = calculatorProxy.divide(10,5);
			System.out.println("The result is : "+ result);
			result = calculatorProxy.divide(5,10);
			System.out.println("The result is : "+ result);
        };
    }

}
