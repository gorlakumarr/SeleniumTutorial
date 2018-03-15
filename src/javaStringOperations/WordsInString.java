package javaStringOperations;

public class WordsInString {
	public static void main(String[] args) {
		System.out.println(count("I am Kumar Gorla"));

		String str1 = "I am Kumar Gorla";
		String[] str3 = str1.split(" ");
		int count = 1;

		for (String string : str3) {
			if (string.trim().length() > 0) {
				count++;

			}

		}
		System.out.println(count + "dfhdfh");

	}

	public static int count(String str) {
		int len = str.length();
		int count = 1;
		char SPACE = 0;
		for (int i = 0; i < len; i++) {

			if (str.charAt(i) == SPACE) {
				count++;
			}
		}
		return count;

	}

}
