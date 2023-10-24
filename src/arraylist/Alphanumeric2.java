package arraylist;

import java.util.Arrays;

public class Alphanumeric2 {

	public static void main(String[] args) {

		String inputString = "abc123";

		String u = inputString.toUpperCase();


		
		char[] arr = u.toCharArray();

		System.out.println(Arrays.toString(arr));

		int sum =0;


		for (int i = 0; i < arr.length; i++) {

			
			if(Character.isDigit(arr[i])) {
				int num = Character.getNumericValue(arr[i]);
				sum+=num;
				
			}
			

		}
		
		System.out.println(sum);
	}
}
//	if (arr[i] < 65 && arr[i] > 90) {
//	
//
//} else {
////	System.out.println(arr[i] +" original");
////	a += (char) arr[i];
////
////	System.out.println(a+"  after char addition");
//}
