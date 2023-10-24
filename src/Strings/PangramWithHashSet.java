package Strings;

import java.util.HashSet;
import java.util.Set;

public class PangramWithHashSet {

	public static void main(String[] args) {

		
		isPangram("The quick brown fox jumps over the lazy dog");
	}

	public static boolean isPangram(String sentence) {

		Set<Character> unique_char = new HashSet<Character>();
		
		String alphaOnly = sentence.toLowerCase().replaceAll("\\s+", "");
		System.out.println(alphaOnly+"  (alphaonly)");
		
		int n = alphaOnly.length();
		
		for (int i = 0; i < n; i++) {
			unique_char.add(alphaOnly.charAt(i));
		}
		
		System.out.println(unique_char);
		System.out.println(unique_char.size());

		
		
		if (unique_char.size() == 26) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
}
