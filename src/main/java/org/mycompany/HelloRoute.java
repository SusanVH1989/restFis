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
	restConfiguration().component("servlet");
		
		rest("/order").get().route().setBody(constant("{id:19}"));
		
	
		
	}
	

}
