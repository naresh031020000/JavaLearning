package Strings;

public class PalindromeEducativeLearningWebsite {
	public static boolean isPalindrome(String s) {

		// Replace this placeholder return statement with your code

		String[] arr = s.split("");

		int i = 0;
		int j = s.length() - 1;

		int n = s.length();

		int count = 0;

		while (i <= j) {

			System.out.println(i + "---" + j);

			if (arr[i].equals(arr[j])) {

				System.out.println(arr[i] + "---" + arr[j]);
				count++;

			} else {
				System.out.println(i + "wle");
				break;
			}

			i++;
			j--;
		}

		

		double res = Math.ceil((double) n / 2);
		

		if (res == count) {
			System.out.println("true");
			return true;
		} else {

			System.out.println("false");

			return false;

		}
	}


	public static void main(String[] args) {

		isPalindrome("raceacar");
	}
}
