package javaStringOperations;

public class RegExp {

	public static void main(String[] args) {

		String s = "aeioud jgs jdfj dgh 0132477";

		String str = ".+";

		System.out.println("*"+s.matches(str));
		System.out.println();

		String str1 = s.replaceAll("\\d", "+");
		System.out.println(str1);
		System.out.println();

		String str12 = s.replaceAll("\\D", "+");
		System.out.println(str12);
		System.out.println();

		String str123 = s.replaceAll("\\s", "+");
		System.out.println(str123);
		System.out.println();

		String str1234 = s.replaceAll("\\S", "+");
		System.out.println(str1234);
		System.out.println();

		String color = "(red|green|white)";

		System.out.println("red".matches(color));
		System.out.println("f".matches(color));
		System.out.println("green".matches(color));
		System.out.println();

		String colors = "wh(i|y)te";
		System.out.println("white".matches(colors));
		System.out.println("whyte".matches(colors));
		System.out.println("green".matches(colors));
		System.out.println();

		String te = "whit(e)?";
		System.out.println("whit  ".matches(te));
		System.out.println("white".matches(te));
		System.out.println("whiteee".matches(te));
		System.out.println();
	}

}
