package org.mycompany;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

	public String getData(String data) {
		data=data+"Hello There, I went through a bean";
		return data;
	}
}
