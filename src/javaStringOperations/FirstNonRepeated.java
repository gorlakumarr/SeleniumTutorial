package javaStringOperations;

import java.util.HashMap;

public class FirstNonRepeated {

	public static void main(String[] args) {

		String str = "Please Penter the input string ";
		char c = firstNonRepeatedCharacter(str);
		System.out.println("The first non repeated character is :  " + c);
	}

	public static Character firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i, length;
		Character c = null;
		length = str.length(); // Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (map.containsKey(c)) {
				System.out.println(map.get(c)); // increment count corresponding to c
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		// Search characterhashtable in in order of string str

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (map.get(c) == 1)
				return c;
		}
		return c;
	}
}