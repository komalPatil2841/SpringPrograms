package com.mouritech.springframework.secondapp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringSecondMain {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Quotation quotation = (Quotation) factory.getBean("quotationService");
		String a = quotation.getQuote();
		System.out.println(a);
		
		Greeting greetings = (Greeting) factory.getBean("greetingService");
		String b = greetings.getGreet();
		System.out.println(b);
		

		Employee emp = (Employee) factory.getBean("empService");
		
		System.out.println(emp.getEmpid());
		emp.setEmpid(456);
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpid());

		Customer cust = (Customer) factory.getBean("customerService");
		
		System.out.println(cust.getCustid());
		System.out.println(cust.getCustname());
		System.out.println(cust.getCustmob());
		System.out.println(cust.getCustemail());
		
		
	}
}
