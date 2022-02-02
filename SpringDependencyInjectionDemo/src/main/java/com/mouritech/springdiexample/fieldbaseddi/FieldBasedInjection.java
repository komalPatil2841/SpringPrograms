package com.mouritech.springdiexample.fieldbaseddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.ShapeService;

@Component
public class FieldBasedInjection {
	@Autowired
	@Qualifier("SquareService")
	private ShapeService shapeserv;

	public ShapeService getShapeserv() {
		return shapeserv;
	}

	public void setShapeserv(ShapeService shapeserv) {
		this.shapeserv = shapeserv;
	}

	
	
	public void getArea(String area) {
		shapeserv.getArea(area);
	}

	
	
}
