package javaStringOperations;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "gkgumarr";

		for (char c : s.toCharArray()) {
			System.out.println("Char :" + c + " :" + s.indexOf(c));
			System.out.println("Char1 :" + c + " :" + s.lastIndexOf(c));
			if (s.indexOf(c) == s.lastIndexOf(c)) {

				System.out.println("String S :" + s + " is C:" + c);
				break;
			}
		}
	}
}