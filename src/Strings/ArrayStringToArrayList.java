package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayStringToArrayList {
    public static void main(String[] args) {
        // Your original array of strings
        String[] s1 = "Hi I am naresh".split(" ");
        
        String[] s2 =  "Hi I am Joel".split(" ");

        // Convert the array to an ArrayList
        List<String> arrayList = new ArrayList<>(Arrays.asList(s1));
        List<String> arrayList2 = new ArrayList<>(Arrays.asList(s2));


        // Now you have an ArrayList of strings
        
        
        System.out.println (  Collections.frequency(arrayList, arrayList2));

    }
}
