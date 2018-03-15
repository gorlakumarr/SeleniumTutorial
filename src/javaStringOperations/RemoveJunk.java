package javaStringOperations;

public class RemoveJunk {
	public static void main(String[] args) {

		String s = "aeioud jgs jdfj dgh 0132477";

		s = s.replaceAll("[^\t]", "");
		System.out.println("-------" + s);

		// Regular Expression {0-9 A-Z a-z}
		s = s.replaceAll("[a,e,i,o,u]", "");
		System.out.println("S value 1 :" + s);

		String str = "adfhgdaad";
		str = str.replaceAll("[^a*]", "");
		System.out.println("S value :" + str);
	}
}
