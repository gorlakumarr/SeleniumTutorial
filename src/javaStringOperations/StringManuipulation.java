package javaStringOperations;

public class StringManuipulation {
	public static void main(String[] args) {

		String str = "The Rains have started here";
		String str1 = "The Rains have started here";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf("s"));

		System.out.println(str.lastIndexOf("s"));

		System.out.println(str.indexOf("s", str.indexOf("s") + 1));

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("g"));// -1

		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase((str1)));

		String str3 = str.substring(0, 8);
		System.out.println(str3);

		String str4 = "Hello_Gk_Good_Morning";
		String[] str5 = str4.split("_");
		for (int i = 0; i < str5.length; i++) {
			System.out.println(str5[i]);

		}
		String str6 = str4.concat(str3);
		System.out.println(str6);
	}
}
