package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PangramWithHashMapMaxValues {

	public static void main(String[] args) {

		String alpha = "The aaaaaquick brown fox jumps over the lazy dog";

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
		int maxValue = 0;

		for (int value : map.values()) {

			if (value != 0) {
				sum++;
			}

			if (value > maxValue) {
				maxValue = value;
			}
		}

		List<Character> charactersWithMaxValue = new ArrayList<>();

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValue) {
				charactersWithMaxValue.add(entry.getKey());
			}
		}

		System.out.println(map);
		System.out.println(sum);

		System.out.println(maxValue + "------");

		System.out.println("Characters with Max Value: " + charactersWithMaxValue + "");

	}

}
