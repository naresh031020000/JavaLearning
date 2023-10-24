package Strings;

public class Vowels {
	public static void main(String[] args) {
		String s = "Hi Naresh";


		int count =0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);


			if(c=='a'|| c=='e' || c=='i'|| c=='o'|| c=='u') {
				
				count++;
				System.out.println(c+"vowels");
				break;
			}
			
			else {
				count=0;
				System.out.println(c+"not a vowels");

			}
		

		}
		
		if(count>0) {
			System.out.println("The given string contains the vowels");

		}
		
		else {
			System.out.println("nothing");

		}
		
	}

}
