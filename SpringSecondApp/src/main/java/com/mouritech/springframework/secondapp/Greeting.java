package com.mouritech.springframework.secondapp;

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
