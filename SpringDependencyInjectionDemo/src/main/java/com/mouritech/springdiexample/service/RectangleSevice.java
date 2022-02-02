package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("RectService")
public class RectangleSevice implements ShapeService {
	double width=20,length=30;
	public void getArea(String area) {
		double a=(length*width)/2;
		 System.out.println( area +" Area of circle  ="+a);
		 
	  }
}
