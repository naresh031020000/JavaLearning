package Strings;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String s = "Madami";
		
		String palCheck ="";
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			
			palCheck=c+palCheck;
			
		}
		
		if(palCheck.equalsIgnoreCase(s)) {
			
			System.out.println("Given string is a palindrome");
		}
		
		else {
			System.out.println("Given string is not a palindrome");

			
		}
	}
}
