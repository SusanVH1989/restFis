package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {
	@Autowired
	MyBean mybean;
	
	@Override
	public void configure() throws Exception {
	
		restConfiguration()
		.component("jetty")
		
		.contextPath("/services")
		;
		
		
		rest("/v1/orders")
		.get().route().log("test").setBody(constant("{order:{id:1,price:100}}"));
		
			
		
		
		

		
		/*
*/
		
	
		
	}
	

}
