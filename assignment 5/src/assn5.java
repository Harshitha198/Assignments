public class assn5 {

	public static boolean checkPrimes(int testNumber) {
		int counter = 1;
		for (int i = 1; i < testNumber; i++) {
			if (testNumber % i == 0) {
				counter++;
			}
		}
		if (counter == 2) {
			return true;

		}
		return false;

	}

	public static int sumOfPrimes(int from, int to) {
		int sum = 0;
		for (int i = from + 1; i < to; i++) {
			if (checkPrimes(i)) {
				sum = sum + i;
			}
		}

		System.out.println("Sum of Prime Number Between Range is " + sum);
		return 0;
	}

	public static void main(String[] args) {
		sumOfPrimes(1, 5);
	}

}