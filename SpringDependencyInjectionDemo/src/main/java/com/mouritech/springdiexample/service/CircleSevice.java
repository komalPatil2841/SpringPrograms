package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("CircleService")
public class CircleSevice implements ShapeService {
	private Double pi =3.4;
			private int r=10;
	public void getArea(String area) {
		
		 System.out.println(area+" Area of circle  ="+pi*r*r);
		 
	  }
}
