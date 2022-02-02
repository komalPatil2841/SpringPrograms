package com.mouritech.springframework.firstapp;

import org.springframework.stereotype.Service;

@Service("greetingService")
public class Greeting {
	private String greet;

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

}
