package com.epsilon.programs;

import java.util.Arrays;

public class Getquo {

	public static void main(String[] args) {
		// System.out.println(Arrays.deepToString(args));
		try {
		
		String a1 = args[0];
		String a2 = args[1];

		int n = Integer.parseInt(a1);
		int d = Integer.parseInt(a2);

		int q = n / d;

		System.out.println("Qoutient of " + n + "/" + d + "=" + q);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Two inputs expected ");
		}
		catch(NumberFormatException e)
		{
			System.err.println("Only Integer values allowed");
			//return
			//throw new RuntimeException("This is a dummy exception");
			// System.exit(12);  -> this doesn't go to finally block
		}
		catch(ArithmeticException e)
		{
			System.err.println("Cannot divide by zero");
		}
		catch(Exception e)      //fallback must always be the last one
		{
			System.err.println("Two inputs expected ");
		}
		finally
		{
			System.out.println("This works in most cases");
		}
		System.out.println("End of main!");
	}

}
