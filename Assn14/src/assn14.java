import java.util.Scanner;

@SuppressWarnings("resource")
public class assn14 {

	static public void printAllCombinations(String input) {
		printAllCombinations("", input);
	}

	private static void printAllCombinations(String permutation, String input) {
		if (input.length() == 0) {
			System.out.println(permutation);

		} else {
			for (int i = 0; i < input.length(); i++) {
				printAllCombinations(permutation + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String word = sc.nextLine();
		printAllCombinations(word);
	}
}