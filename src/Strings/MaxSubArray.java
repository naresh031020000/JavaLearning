package Strings;

public class MaxSubArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {

				int sum = 0;

				for (int k = i; k < j; k++) {
					sum = sum + nums[k];

//					System.out.print(nums[k] + "");
//					System.out.println("..."+sum);

				}

				System.out.println("..."+sum);

			}

		}

	}
}