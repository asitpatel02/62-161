package Extra;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static int wordCount(String strings) {
		StringTokenizer Token = new StringTokenizer(strings);
		return Token.countTokens();
	}

	public static void main(String[] args) {
		String input;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string: ");
		input = keyboard.nextLine();

		System.out.println("That string has " + wordCount(input) + " words in it.");

		System.exit(0);
	}
}