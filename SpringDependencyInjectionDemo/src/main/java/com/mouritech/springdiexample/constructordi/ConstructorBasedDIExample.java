package com.mouritech.springdiexample.constructordi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexample.service.ShapeService;


@Component
public class ConstructorBasedDIExample {
	private ShapeService shapeServ;


	public ShapeService getShapeServ() {
		return shapeServ;
	}
	public void setShapeServ(ShapeService shapeServ) {
		this.shapeServ = shapeServ;
	}
	@Autowired
	public ConstructorBasedDIExample(@Qualifier("SquareService") ShapeService sService) {
		super();
		this.shapeServ = sService;
	}

	
	public void getArea(String area) {
		shapeServ.getArea(area);
	}
	
}
