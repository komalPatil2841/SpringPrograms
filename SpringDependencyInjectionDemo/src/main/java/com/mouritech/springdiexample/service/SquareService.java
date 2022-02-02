package com.mouritech.springdiexample.service;

import org.springframework.stereotype.Service;

@Service("SquareService")
public class SquareService implements ShapeService {
	
	private double side=10;
public void getArea(String area) {
	double a=side*side;
 System.out.println(area+" Area of Square  ="+a);
 
}
}
