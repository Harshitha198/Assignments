package com.epsilon.programs;

import java.io.IOException;

public class ReadFromKeyboard {
	public static void main(String[] args) throws IOException {
		System.out.println("enter your name: ");
		int ch=System.in.read();
		System.out.println(ch);
	}

}
