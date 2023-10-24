package Strings;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
public class ExpressionToValue {
	public static void main(String[] args) {
		String expr =("2+64/8/4/2");
		
		char[] ar = expr.toCharArray();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Character> operators = new ArrayList<Character>();
		String num = "";
		System.out.println("char[] : "+Arrays.toString(ar));
		
		for (int i = 0; i < ar.length; i++) {
			if (Character.isDigit(ar[i])) {
				num += ar[i]; //24
			} else {
				numbers.add(Integer.parseInt(num));//24 ,23  45 1
				operators.add(ar[i]);//+ - +
				num = "";
			}
		}
		
		numbers.add(Integer.parseInt(num));
		System.out.println(numbers);
		System.out.println(operators);
		
		int divCheck = 0;
		int multiCheck = 0;
		int addCheck = 0;
		int subCheck = 0;
		while (divCheck == 0) {
			System.out.println("in divide while");
			divCheck = operations(operators, numbers, '/');
		}
		
		System.out.println(numbers);
	
	}
	public static void evaluateExpression() {
		
//		while (multiCheck == 0) {
//			System.out.println("in multi while");
//			multiCheck = operations(operators, numbers, '*');
//		}
//		while (addCheck == 0) {
//			System.out.println("in add while");
//			addCheck = operations(operators, numbers, '+');
//		}
//		while (subCheck == 0) {
//			System.out.println("in sub while");
//			subCheck = operations(operators, numbers, '-');
//		}
//		System.out.println(numbers);
//		System.out.println(operators);
	}

	public static int operations(ArrayList<Character> operators, ArrayList<Integer> numbers, char operator) {
		int temp = 0;
		for (int i =0;i<operators.size();i++) {
			
			if (operators.get(i) == '/') {
					temp = numbers.get(i) / numbers.get(i + 1);
				numbers.remove(i);
				numbers.remove(i );
				operators.remove(i);
				numbers.add(i, temp);
				System.out.println(numbers);
				System.out.println(temp);
				return 0;
			}
		}
		return 1;
	}
}