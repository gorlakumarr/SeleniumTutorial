package javaStringOperations;

public class SortStringArray {

	public static void main(String[] args) {
		String str = "KUMAR";

		char[] char1 = str.toCharArray();
		char tem;
		for (int i = 0; i < char1.length; i++) {
			for (int j = 1; j < char1.length; j++) {

				if (char1[i] > char1[j]) {
					tem = char1[i];
					char1[i] = char1[j];
					char1[j] = tem;
				}

			}

		}
		System.out.println(char1);
		String sorted = "";
		for (int k = 0; k < char1.length; k++) {
			sorted = sorted + char1[k];
		}
		System.out.println(sorted);
	}

}
