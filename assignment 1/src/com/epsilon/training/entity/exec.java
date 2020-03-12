package com.epsilon.training.entity;

import com.epsilon.training.Assignment1;

public class exec {
	public static void main(String[] args) {
	
	
	Assignment1 a1;
	a1=new Assignment1();
	
	if(a1.isValidDate(2016,2,29))
		System.out.println("yes");
	else
		System.out.println("no");
	
	}
}
