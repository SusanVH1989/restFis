/**
 * 
 */
package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author hailssus
 *
 */
public class HelloProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
	String input=exchange.getIn().getBody(String.class);
	input=input+"  welcome";
	exchange.getIn().setBody(input);
		
	}

}
