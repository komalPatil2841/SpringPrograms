package com.mouritech.springframework.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Quotation quotation = (Quotation) context.getBean("quotationService");
		String a = quotation.getQuote();
		System.out.println(a);
		
		Greeting greetings = (Greeting) context.getBean("greetingService");
		String b = greetings.getGreet();
		System.out.println(b);
		

		Employee emp = (Employee) context.getBean("empService");
		
		System.out.println(emp.getEmpid());
		emp.setEmpid(456);
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpid());

		Customer cust = (Customer) context.getBean("customerService");
		
		System.out.println(cust.getCustid());
		System.out.println(cust.getCustname());
		System.out.println(cust.getCustmob());
		System.out.println(cust.getCustemail());
		
		
	}
}
