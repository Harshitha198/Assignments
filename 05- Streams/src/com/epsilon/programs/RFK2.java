package com.epsilon.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RFK2 {
	public static void main2(String[] args) throws IOException {
		System.out.println("enter your name: ");
		int ch;
		String name="";
		
		while((ch=System.in.read())!='\n') {
			name+=(char)ch;
		}
		System.out.println("Hello "+name);
	}

	
	public static void main1(String[] args) throws IOException {
		System.out.println("Enter your name: ");
		byte[] bytes=new byte[120];
		System.in.read(bytes);
		String name=new String(bytes).trim();
		System.out.println("===>"+name+"<===");
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("enter your name: ");
		
		//conv system.in into a reader object
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(isr);
		
		String name=in.readLine();
		System.out.println("Hello "+name+"!");
	}
}
