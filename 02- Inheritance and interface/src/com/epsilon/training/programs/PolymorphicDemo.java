package com.epsilon.training.programs;

import com.epsilom.training.entity.Circle;
import com.epsilom.training.entity.Shape;
import com.epsilom.training.entity.Triangle;

public class PolymorphicDemo {

	public static void main(String[] args) {

		Shape[] shapes = {
				new Triangle(1.2,4.6),
				new Triangle(1,2),
				new Circle(2.36),
				new Circle(4.58),
				new Triangle(2,4),
				new Triangle(4,5)
		};
		
		for(Shape s:shapes)
		{
			System.out.println("-------------------------------------------------");
			s.printArea();
		}
	}

}
