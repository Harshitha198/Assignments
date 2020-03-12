package com.epsilom.training.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString


public class Triangle extends Shape {

	private double base;
	private double height;

	
	@Override
	public void printArea() {
		double area=0.5*base*height;
		logger.info("Area of triangle= "+area+" sq units");
	}


	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

}
