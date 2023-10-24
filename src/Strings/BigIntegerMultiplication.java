package Strings;

//Java program to demonstrate 
//multiply() method of BigInteger 

import java.math.BigInteger; 

public class BigIntegerMultiplication { 
	public static void main(String[] args) 
	{ 
		// BigInteger object to store result 
		BigInteger mult; 

		// For user input 
		// Use Scanner or BufferedReader 

		// Two objects of String created 
		// Holds the values to calculate the multiplication 
		String input1 = "012345678901234567"
						+ "8901234567890123"
						+ "4567890123456789"
						+ "0123456789012345"
						+ "6789012345678901"
						+ "654632498739473"; 

		String input2 = "0123456789012345"
						+ "6789012345678901"
						+ "2345678901234567"
						+ "8901234567890123"
						+ "4567890123456789"
						+ "61247612748612746"; 

		// Convert the string input to BigInteger 
		BigInteger a 
			= new BigInteger(input1); 
		BigInteger b 
			= new BigInteger(input2); 

		// Using multiply() method 
		mult = a.multiply(b); 

		// Display the result in BigInteger 
		System.out.println(mult); 

//		// Using double to hold the result 
//		double d = Double.parseDouble(mult.toString()); 
//
//		// Display the result in double 
//		System.out.println("Using double, multiplication is "
//						+ d); 
	} 
} 

