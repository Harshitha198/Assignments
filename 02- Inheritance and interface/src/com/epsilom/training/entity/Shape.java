package com.epsilom.training.entity;

import java.util.logging.Logger;

public abstract class Shape {
		
		Logger logger=Logger.getLogger(Shape.class.getName());
		
		protected static final double PI=3.1416;
		
		public void info() {
			logger.info("Classname: Shape");
			logger.info("Created by Harshitha");	
		}
		
		public abstract void printArea();
		
}
