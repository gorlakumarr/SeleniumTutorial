package javaStringOperations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesArray {
	public static void main(String[] args) {
		String name[] = { "Gk", "Gk", "Java", "Raj", "Shyam" };

		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println("Duplicate Value is :" + name[i]);

				}

			}

		}
		System.out.println("*****************************************************");
		Set<String> set = new HashSet<String>();
		for (String string : name) {
			if (set.add(string) == false) {
				System.out.println("Duplicate Value is :" + string);
			}

		}
		System.out.println("*****************************************************");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String string : name) {
			Integer count = map.get(string);
			if (count == null) {
				map.put(string, 1);

			} else {
				map.put(string, ++count);
			}

		}

		Set<Entry<String, Integer>> entryset = map.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Value :" + entry.getKey());

			}
		}

	}
}
