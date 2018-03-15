package javaStringOperations;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "sandeep";
		System.out.println(removeDuplicatea(str));

	}

	public static String removeDuplicatea(String str) {
		Set<Character> set = new HashSet<Character>();

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			Character chr = str.charAt(i);
			if (!set.contains(chr)) {
				set.add(chr);
				buffer.append(chr);

			}

		}
		return buffer.toString();

	}
}
