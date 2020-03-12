package com.epsilon.training.programs;

public class HelloWorld {
	
	public static void main(String[] args) {
	System.out.println("hello world!");
	//variable declaration
	Person p1;
	
	//variable assigned to an object
	p1=new Person();
	p1.age=22;
	p1.height=5.6;
	
//	System.out.println("p1 is"+p1);
	System.out.println("p1 age is "+p1.age+" years");
	System.out.println("p1 height is "+p1.height+" ft");
}}

