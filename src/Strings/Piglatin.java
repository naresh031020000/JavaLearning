package Strings;

public class Piglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "clear";
		
		String p="";
		
		for(int i=0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			char u=Character.toLowerCase(c);
			
			
			
			if(u=='a'|| u=='e' || u=='i'|| u=='o'|| u=='u') {


				if(i==0) {
					System.out.println(u+"  "+i);

					p = s+"way";
					System.out.println(p);


				}
				
				else {

				p=	s.substring(i)+s.substring(0, i)+"ay";
				System.out.println(p);
				break;

				}
		
			}
		}
		

	}

}
