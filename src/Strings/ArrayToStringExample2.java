package Strings;

//This Java program demonstrates how to convert an array of characters into a string 
//using StringBuilder

import java.lang.*;

public class ArrayToStringExample2 {

	public static void main(String[] args) {
		// Initialize a StringBuilder with a string
		
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder before appending array: " + sb);

		
		// Initialize an array of characters
		String[] arr = new String[] { "A", "E", "i", "o", "u" };

		
		// Append the array of characters to the StringBuilder
		
		for(String s:arr) {
			
			sb.append(s);

		}

		// Print the result
		System.out.println("Result after appending array: " + sb);
	}
}
