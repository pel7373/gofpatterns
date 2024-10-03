package org.calculator;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import org.wsdl.*;

public class CalculatorClient  extends WebServiceGatewaySupport implements Calculator {

	@Override
	public int sum(int number1, int number2) {
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

	@Override
	public int subtract(int a, int b) {
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

	@Override
	public int multiply(int a,int b) {
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

	@Override
	public int divide(int a,int b) {
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
