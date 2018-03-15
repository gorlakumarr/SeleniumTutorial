package javaStringOperations;

public class Swap {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		int t;
		t = x;
		x = y;
		y = t;
		System.out.println(x + "*****" + y);

		x = x + y;// 15
		y = x - y;// 5
		x = x - y;// 10

		System.out.println(x + "*****" + y);

	}
}
