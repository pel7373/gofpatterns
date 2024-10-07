package org.calculator.calculator;

import org.calculator.config.Operation;
import org.calculator.exception.InvalidOperandException;
import org.calculator.exception.InvalidOperationException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.wsdl.*;

public class CalculatorImplSOAP extends WebServiceGatewaySupport implements Calculator<Integer> {

	@Override
	public Integer calculate(Operation operation, Integer... operands) {
		if(operands == null || operands.length == 0) {
			throw new InvalidOperandException("The number of operands cannot be zero!");
		}

		if(operands.length >= 2) {
			if(operands[0] == null || operands[1] == null) {
				throw new InvalidOperandException("Operands cannot be null!");
			}

			int number1 = operands[0];
			int number2 = operands[1];
			switch (operation) {
				case ADD: return sum(number1, number2);
				case SUBTRACT: return subtract(number1, number2);
				case MULTIPLY: return multiply(number1, number2);
				case DIVIDE: return divide(number1, number2);
			}
		}

		if(operands[0] == null) {
			throw new InvalidOperandException("Operands cannot be null!");
		}
		int number1 = operands[0];
		switch (operation) {
			case SQRT: return (int) Math.round(Math.sqrt((double)number1));
		}

		throw new InvalidOperationException(String.format("Invalid operation %s with operands %s", operation, operands));
	}

	private int sum(int number1, int number2) {
		Add request = new Add();
		request.setIntA(number1);
		request.setIntB(number2);
		AddResponse response =(AddResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						  request,
						  new SoapActionCallback("http://tempuri.org/Add")
							);		
		return response.getAddResult();
	}

	private int subtract(int a, int b) {
		Subtract  request = new Subtract();
		request.setIntA(a);
		request.setIntB(b);
		
		SubtractResponse response = (SubtractResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						  request,
						  new SoapActionCallback("http://tempuri.org/Subtract")
							);	
		return response.getSubtractResult();
	}

	private int multiply(int a,int b) {
		Multiply request = new Multiply();
		request.setIntA(a);
		request.setIntB(b);

		MultiplyResponse response = (MultiplyResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						request,
						new SoapActionCallback("http://tempuri.org/Multiply")
				);
		return response.getMultiplyResult();
	}

	private int divide(int a,int b) {
		Divide request = new Divide();
		request.setIntA(a);
		request.setIntB(b);

		DivideResponse response = (DivideResponse) getWebServiceTemplate()
				.marshalSendAndReceive(
						request,
						new SoapActionCallback("http://tempuri.org/Divide")
				);
		return response.getDivideResult();
	}
}
