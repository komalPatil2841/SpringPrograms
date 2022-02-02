package com.mouritech.springdiexample.setterdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.ShapeService;

@Component
public class SetterBasedInjectionExample {
	private ShapeService shapeserv;
	
	public SetterBasedInjectionExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SetterBasedInjectionExample(ShapeService shapeserv) {
		super();
		this.shapeserv = shapeserv;
	}

	public ShapeService getShapeserv() {
		return shapeserv;
	}
	
	@Autowired	
	@Qualifier("CircleService")
	public void setShapeserv(ShapeService shapeserv) {
		this.shapeserv = shapeserv;
	}

	public void getArea(String area) {
		shapeserv.getArea(area);
	}
	

}
