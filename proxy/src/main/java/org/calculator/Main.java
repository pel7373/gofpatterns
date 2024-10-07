package org.calculator;

import org.calculator.calculator.Calculator;
import org.calculator.calculator.CalculatorImplSOAP;
import org.calculator.config.Operation;
import org.calculator.exception.InvalidOperandException;
import org.calculator.exception.InvalidOperationException;
import org.calculator.proxy.CacheProxyCalculator;
import org.calculator.proxy.ProfilerProxyCalculator;
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
    CommandLineRunner lookup(CalculatorImplSOAP calculatorImplSOAP) {
        return args -> {
			Calculator<Integer> calculator = new ProfilerProxyCalculator(
					new CacheProxyCalculator(calculatorImplSOAP));
			try {
				int result;
				Operation operation = Operation.ADD;
				int a = 5;
				int b = 10;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				a = 10;
				b = 5;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);

				System.out.println();
				operation = Operation.SUBTRACT;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				a = 5;
				b = 10;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);

				System.out.println();
				operation = Operation.MULTIPLY;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				a = 10;
				b = 5;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);

				System.out.println();
				operation = Operation.DIVIDE;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				a = 5;
				b = 10;
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);
				result = calculator.calculate(operation, a, b);
				System.out.printf("%d %s %d = %d\n", a, operation, b, result);

				System.out.println();
				operation = Operation.SQRT;
				result = calculator.calculate(operation, a);
				System.out.printf("%s %d = %d\n", operation, a, result);
				result = calculator.calculate(operation, a);
				System.out.printf("%s %d = %d\n", operation, a, result);
			} catch (InvalidOperationException | InvalidOperandException e) {
				System.out.println(e.getMessage());
			}
        };
    }
}
