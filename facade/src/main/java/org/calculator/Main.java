package org.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
    CommandLineRunner lookup(org.calculator.CalculatorClient calculator) {
        return args -> {
			Calculator calculatorFacade = new CalculatorImpl(calculator);
        	int result;
        	result = calculatorFacade.sum(3, 5);
        	System.out.println("The result is : "+ result);
        	result = calculatorFacade.subtract(15,10);
        	System.out.println("The result is : "+ result);
			result = calculatorFacade.multiply(15,10);
			System.out.println("The result is : "+ result);
			result = calculatorFacade.divide(13,5);
			System.out.println("The result is : "+ result);
        };
    }

}
