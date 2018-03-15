package javaStringOperations;

public class ReverseString {
	public static void main(String[] args) {

		String str = "Kumar";

		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
			System.out.println("temp :" + temp);

		}
		System.out.println(temp);

		StringBuffer buffer = new StringBuffer(str);
		StringBuffer rever = buffer.reverse();
		System.out.println(rever);
	}

}
