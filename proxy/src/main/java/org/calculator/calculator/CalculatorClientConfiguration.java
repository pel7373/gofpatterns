package org.calculator.calculator;

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
	public CalculatorImplSOAP calculatorclient(Jaxb2Marshaller marshaller) {
		final CalculatorImplSOAP client = new CalculatorImplSOAP();
		client.setDefaultUri("http://www.dneonline.com/calculator.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
