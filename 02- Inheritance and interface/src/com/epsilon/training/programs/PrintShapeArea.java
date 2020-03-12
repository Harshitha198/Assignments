package com.epsilon.training.programs;

import com.epsilom.training.entity.Shape;

import com.epsilom.training.entity.Triangle;

public class PrintShapeArea {

	public static void main(String[] args) {
		Shape s1;
		//s1=new Shape();
		s1=new Triangle(12.5,45.6);
		s1.info();
		s1.printArea();
	}
	
	
}
