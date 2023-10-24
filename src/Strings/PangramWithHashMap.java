package Strings;

import java.util.HashMap;

public class PangramWithHashMap {
	public static void main(String[] args) {

		String alpha = "The quick brown fox jumps over the lazy dog";

		String alpha1 = alpha.replaceAll("\\s+", "").toLowerCase();

		System.out.println(alpha1);

		char[] strArray = alpha1.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 1;

		for (char c : strArray) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, count);

			}

		}
		int sum = 0;

		for (int value : map.values()) {

			if (value != 0) {
				sum++;
			}
		}

		if (sum == 26) {

			System.out.println(true);
		}

		else {
			System.out.println(false);

		}

		System.out.println(map);
		System.out.println(sum);

	}

}
