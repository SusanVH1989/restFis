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
		.port("8080");
		
		rest("/order").get().route().setBody(constant("{id:19}"));
		
	
		
	}
	

}
