package Strings;

import java.util.Iterator;

public class Array2DElement {

	public static void main(String[] args) {

		int[][] arr = {

				{ 1, 2, 3 }, { 1000, 1121, 2304 }, { 2305, 2356, 2357 } };

		int value = 2357;

		int getRow = 0;
		int m = 3;
		int n = 3;

		for (int i = 0; i < m; i++) {

			if (arr[getRow][n - 1] < value) {
				
				getRow++;

			}
			else {
				break;
			} 

		}
		


		for (int i = 0; i < n; i++) {

			if (arr[getRow][i] == value) {
				System.out.println("true");
				
				System.out.println(getRow +" "+ i+"-------"+ arr[getRow][i]);
				
				break;

			}
			
		

		}
		
		


	}
}
