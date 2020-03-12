package com.epsilon.programs;

import java.util.Arrays;

public class GetQuotient {

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
		catch(Exception e)
		{
			System.err.println("There was an error "+e.getMessage());
		}

		System.out.println("End of main!");
	}

}
