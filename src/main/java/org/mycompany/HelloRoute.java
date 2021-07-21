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
		.host("localhost")
		.contextPath("/services")
		.port("8083");
		
		
		rest("/v1/orders")
		.get().route().log("test").setBody(constant("{order:{id:1,price:100}}"));
		
			
		
		
		

		
		/*
		 * from("file:C:\\Users\\hailssus\\Desktop\\Input\\Day1?noop=true")
		 * .log("${body}") .process(new HelloProcessor()) .to("direct:myRoute2");
		 * 
		 * from("direct:myRoute2") .bean(mybean,"getData")
		 * .to("file:C:\\Users\\hailssus\\Desktop\\Out\\Day1");
		 */
		
	
		
	}
	

}
