package javaStringOperations;

import java.util.Arrays;

public class LargestAndSmall {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 8, 10 };

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {

				max = a[i];
			} else if (a[i] < min) {
				min = a[i];

			}

		}
		System.out.println(Arrays.toString(a));

		for (int i : a) {
			System.out.println(i);

		}

		System.out.println("Max :" + max + "  and Min Value :" + min);

	}

}
