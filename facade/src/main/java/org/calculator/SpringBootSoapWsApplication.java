package org.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootSoapWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsApplication.class, args);
	}
	
	@Bean
    CommandLineRunner lookup(org.calculator.CalculatorClient calculator) {
        return args -> {
        	int result;
        	result = calculator.add(3, 5);
        	System.out.println("The result is : "+ result);
        	result = calculator.substract(15,10);
        	System.out.println("The result is : "+ result);
			result = calculator.multiply(15,10);
			System.out.println("The result is : "+ result);
			result = calculator.divide(13,5);
			System.out.println("The result is : "+ result);
        };
    }

}
