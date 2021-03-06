package javaStringOperations;

/**
 * Java program to count the number of occurrence of any character on String.
 * 
 * @author Javin Paul
 */
public class CountCharacters {

	public static void main(String args[]) {

		String input = "Today'a is Monday"; // count number of "a" on this String.

		// counting occurrence of character with loop
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {
				charCount++;
			}
		}
		System.out.println("count  " + charCount);

		// a more elegant way of counting occurrence of character in String using
		// foreach loop

		charCount = 0; // resetting character count
		for (char ch : input.toCharArray()) {
			if (ch == 'a') {
				charCount++;
			}
		}
		System.out.println("count   " + charCount);
	}

}
