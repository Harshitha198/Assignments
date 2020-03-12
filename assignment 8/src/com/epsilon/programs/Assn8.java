package com.epsilon.programs;

public class Assn8 {

	public static float sine(float x) {
		float sin = 0.0f;
		long fact;
		for (int i = 1; i <= 30; i++) {
			fact = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				fact = fact * j;
			}
			if (i % 2 == 1) {
				sin = sin + (float) (powerOf(x, 2 * i - 1) / fact);
			} else {
				sin = sin - (float) (powerOf(x, 2 * i - 1) / fact);
			}
		}
		return sin;
	}

	public static float powerOf(float base, int exponent) {
		float result = 1;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;

	}

	public static void main(String args[]) {
		float num = 1.57079632679f;
		System.out.println("Sin(" + num + ") is Equal to " + sine(num));
		System.out.println("Sin(" + 0 + ") is Equal to " + sine(0));
	}
}