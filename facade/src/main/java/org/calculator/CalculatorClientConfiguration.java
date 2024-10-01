package org.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CalculatorClientConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("org.wsdl");
		return marshaller;
	}

	@Bean
	public org.calculator.CalculatorClient calculatorclient(Jaxb2Marshaller marshaller) {
		final org.calculator.CalculatorClient client = new org.calculator.CalculatorClient();
		client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
