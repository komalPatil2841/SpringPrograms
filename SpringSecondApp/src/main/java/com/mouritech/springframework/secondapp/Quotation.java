package com.mouritech.springframework.secondapp;

import org.springframework.stereotype.Service;

@Service("quotationService")
public class Quotation {
private String quote;

public String getQuote() {
	return quote;
}

public void setQuote(String quote) {
	this.quote = quote;
}

}
