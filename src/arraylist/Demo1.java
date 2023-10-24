package arraylist;

import java.util.*;

public class Demo1 {

	public static void main(String args[]) {
		// create an ArrayList of String type
		// and Initialize an ArrayList with asList()
		
		 char[] arr = {'a','b'};
	
		ArrayList<Character> scaler = new ArrayList<Character>();

		// to print the ArrayList
		System.out.println("ArrayList is " + scaler);
		
		scaler.remove(2);
		System.out.println(scaler);
	}

}
