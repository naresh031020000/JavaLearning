package Strings;

import java.util.Arrays;

class Solution {

	public void rotate(int[] nums, int k) {

		int n = nums.length;
		int i = 0;
		int j = n - 1;

		if (n == 1) {

			nums[0] = nums[0];
		}

		else if (k == 0) {

			for (int g = 0; g < n; g++) {

				nums[g] = nums[g];
			}
		} else if (n != 1) {
			System.out.println(Arrays.toString(nums) + "original");

			while (i < j) {

				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;

				i++;
				j--;

			}

			i = 0;
			System.out.println(Arrays.toString(nums) + "reverse");
			System.out.println(i + "-----------" + (k - 1));

			int count = 1;

			while (i <= k - 1) {

				int temp = nums[i];
				nums[i] = nums[k - 1];
				nums[k - 1] = temp;

				i++;
				k--;
				count++;

			}

			k = count;

			System.out.println(Arrays.toString(nums) + "reverse half");
			System.out.println("coun-------" + k);

			System.out.println(k + "-----------" + n);

			while (k < n) {

				int temp = nums[k];
				nums[k] = nums[n - 1];
				nums[n - 1] = temp;

				k++;
				n--;

			}
			System.out.println(Arrays.toString(nums) + "finish");

		}

	}
}
