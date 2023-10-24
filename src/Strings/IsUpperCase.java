package Strings;

public class IsUpperCase {

	public static void main(String[] args) {

		String s = "Hi11234567890Naresh";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			boolean characters = Character.isDigit(c);

			if (characters) {
				count++;
			}

			System.out.println(characters + " " + c);

//			System.out.println(c);

//			System.out.println(c+"  "+(int)c);
		}
		
		System.out.println(count);
	}
}
