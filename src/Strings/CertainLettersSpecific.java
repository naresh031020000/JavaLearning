package Strings;

public class CertainLettersSpecific {

	public static void main(String[] args) {
		String s = "Hi Naresh";


		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);


			if(c=='a'|| c=='e') {
				
				System.out.println(c);
			}
			
			else {
				System.out.println("nothing");
			}
		

		}
		
	}
}
