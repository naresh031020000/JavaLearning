package Strings;

import java.util.Arrays;

public class ArrayRotation3 {

	public  void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));
        int m = 0;
        int l = k - 1;
        while (m < l) {
            int temp = nums[m];
            nums[m] = nums[l];
            nums[l] = temp;
            m++;
            l--;
        }
        System.out.println(Arrays.toString(nums));
        int z = k;
        int o = n - 1;
        while (z < o) {
            int temp = nums[z];
            nums[z] = nums[o];
            nums[o] = temp;
            z++;
            o--;
        }
        System.out.println(Arrays.toString(nums));
    }
	

}
