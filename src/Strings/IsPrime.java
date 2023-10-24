package Strings;

//JAVA program to demonstrate 
//Optimized method based 
//to check if a number is prime 

public class IsPrime { 
	static boolean isPrime(int n) 
	{ 
		// Corner case 
		if (n <= 1) 
			return false; 

		if (n == 2 || n == 3) 
			return true; 

		if (n % 2 == 0 || n % 3 == 0) 
			return false; 

		for (int i = 5; i < Math.sqrt(n); i = i + 6) 
			if (n % i == 0 || n % (i + 2) == 0) 
				return false; 

		return true; 
	} 

	// Driver Program 
	public static void main(String args[]) 
	{ 
		if (isPrime(97)) 
			System.out.println(" true"); 
		else
			System.out.println(" false"); 
		
	} 
}
