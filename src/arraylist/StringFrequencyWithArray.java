package arraylist;

import java.util.Arrays;

public class StringFrequencyWithArray {
    public static void main(String[] args) {
        // Create an array of strings
    	String[] words = {
    		    "apple", "banana", "cherry","cherry","cherry","cherry","cherry","cherry","cherry", "banana", "apple", "cherry",
    		    "grape", "kiwi", "lemon", "kiwi", "cherry", "lemon",
    		    "mango", "orange", "apple", "mango", "banana", "kiwi"
    		};

        // Create an array to store the frequency of each string
        int[] frequencies = new int[words.length];

        // Iterate through the array and update the frequency array
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    frequencies[i]++;
                    System.out.println(Arrays.toString(frequencies)+"------for loop-------"+words[i]+"---------------"+i+"    "+j);
                }
            }
        }

        // Display the frequency of each string
        
        String maxword="";
        int maxFrequency =0;
        
        for (int i = 0; i < words.length; i++) {
        	
        	if(frequencies[i]>maxFrequency) {
        		maxFrequency=frequencies[i];
                System.out.println("Word: " + words[i] + ", Frequency: " + frequencies[i]);

        	}
        }
    }
}

