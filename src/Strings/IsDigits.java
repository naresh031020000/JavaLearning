package Strings;

public class IsDigits {

	public static void main(String[] args) {
		String s = "Hi11234567890Naresh";

		int digitCount = 0;
		int lowercaseCount = 0;
		int uppercaseCount = 0;


		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			
			boolean isLowerCase = Character.isLowerCase(c);
			boolean isUpperCase = Character.isUpperCase(c);

			boolean isDigits = Character.isDigit(c);
			

			
			if (isLowerCase) {
				lowercaseCount++;
			}
			
			else if (isUpperCase) {
				uppercaseCount++;
			}

			else {
				digitCount++;
			}

		}
		
		System.out.println(lowercaseCount+"---lowercaseCount");
		System.out.println(uppercaseCount+ "---uppercaseCount");
		System.out.println(digitCount+ "---digitCount");

	}

}
