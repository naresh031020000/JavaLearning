package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr= {1,8,9};
		
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("naresh");
		list1.add("balaji");
		list1.add("joel");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("mango");
		list.add("orange");
		
//System.out.println(list);		
//
//       list.add(0, null);
//       
//       System.out.println(list);
//       
//       list.addAll(list1);
//       
//       System.out.println(list);
//       list.addAll(2, list1);
//       System.out.println(list);
//       
//       list.clear();
       
       System.out.println(list);	
       
      
       System.out.println(list1.contains("naresh"));	
       
       list.set(0, "na");
       
       System.out.println(list);	
       
       list.add(1,"en");

       System.out.println(list);	

       		


       
       

	}
}
