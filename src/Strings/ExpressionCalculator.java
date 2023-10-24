package Strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ExpressionCalculator {
	public static int EvaluateExpression(String expr) {

		 char[] arr = expr.toCharArray();

	        ArrayList<Integer> values = new ArrayList<>();
	        ArrayList<Character> operators = new ArrayList<>();

	        String n = "";

	        for (int i = 0; i < arr.length; i++) { 
	            if (Character.isDigit(arr[i])) {
	                n += arr[i];
	            } else {
	                values.add(Integer.parseInt(n));
	                operators.add(arr[i]);
	                n = "";
	            }
	        }

	        values.add(Integer.parseInt(n));
	        
	        System.out.println(values);
		       System.out.println(operators);


	        for (int i = 0; i < operators.size(); i++) {
	            if (operators.get(i) == '/') {
	                int temp = values.get(i) / values.get(i + 1);
	                operators.remove(i);
	                values.remove(i);
	                values.remove(i);
	                values.add(i, temp);
	                i--; // 
	            }
	            
	            System.out.println(values);
	 	       System.out.println(operators);
	        }
	        
	        
	     

	       
	       for (int i = 0; i < operators.size(); i++) {
	            if (operators.get(i) == '*') {
	                int temp = values.get(i) * values.get(i + 1);
	                operators.remove(i);
	                values.remove(i);
	                values.remove(i);
	                values.add(i, temp);
	                i--; // for reducing the values of precedence
	            }
	            
	            System.out.println(values);
	 	       System.out.println(operators);
	        }
	       
	      
	       
	        int result = values.get(0);
	        for (int i = 0; i < operators.size(); i++) {
	            char op = operators.get(i);
	            int nextValue = values.get(i + 1);
	            
	            if (op == '+') {
	                result += nextValue;
	            } else if (op == '-') {
	                result -= nextValue;
	            }
	        }

	        return result;
	    
	}

	public static void main(String[] args) {
		String expr ="10*24/2/4/3"; 
		int result = EvaluateExpression(expr);
		System.out.println(result);
	}
}
