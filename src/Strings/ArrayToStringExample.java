package Strings;

//This Java program demonstrates how to convert an array of strings into a single string 
//using the String.join() method

import java.lang.*;

public class ArrayToStringExample {

	public static void main(String[] args) {
		
		// Initialize an array of strings
		String[] strArray = new String[] { "Converted", "using", "Java", "Streams" };

		// Use the String.join() method to join the array of strings into a single
		// string
		String joinedString = String.join( "",  strArray);

		// Print the result
		System.out.println(joinedString);
	}
}
