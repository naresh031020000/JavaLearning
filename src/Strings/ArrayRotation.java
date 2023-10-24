package Strings;

import java.util.Arrays;

public class ArrayRotation {


	    public void rotate(int[] nums, int k) {

	        int[] arr = new int[nums.length];

	        int j = 0;

	        for (int i = nums.length - k; i < nums.length; i++) {

	            arr[j++] = nums[i];
	        }

	        int g = 0;
	        for (int i = k; i < nums.length; i++) {
	            arr[i] = nums[g++];
	        }

	        System.out.println(Arrays.toString(arr));

	    
	}

}
