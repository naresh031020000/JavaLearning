package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class BracketArray {

	public static void main(String[] args) {

//		char[] arr = { '{', '}', '{', '}' };
		
		char[] arr = { '}', '}', '{','}', '{','}' };


		ArrayList<Character> list = new ArrayList<>();

		for (Character c : arr) {
			list.add(c);
		}
		
		if(list.get(0)=='}') {
			
			System.out.println("error in first ");
			return;
			
		}
//		System.out.println(list+"-------original");


		int count = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == '{') {

//				System.out.println(list.get(i)+"---------"+i);

				list.remove(i);
				count++;
				i--;

			}

		}
		
		System.out.println(list);
//
//		System.out.println(list.size());
//		
//		System.out.println(count);

		if (count == list.size()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");

		}
		

	}

}
