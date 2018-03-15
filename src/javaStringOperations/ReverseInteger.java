package javaStringOperations;

public class ReverseInteger {
	public static void main(String[] args) {

		int num = 1285765;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		int num1 = 1125456;
		StringBuffer buffer = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(buffer);

	}

}
