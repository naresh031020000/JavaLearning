package Strings;

public class ArrayRotation2 {

}

//
//class Solution {
//
//    public void rotate(int[] nums, int k) {
//        int[] arr = new int[nums.length];
//
//        int j = 0;
//
//        if (nums.length == 1) {
//            System.out.println(Arrays.toString(nums) + " num 2 ------onee");
//        } 
//        
//        else if (nums.length == 2) {
//            if (k % 2 == 0) {
//                System.out.println(Arrays.toString(nums) + " num 2 ------even");
//            } else {
//                int temp = nums[0];
//                nums[0] = nums[1];
//                nums[1] = temp;
//                System.out.println(Arrays.toString(nums) + " num 2 ------odd");
//            }
//        } 
//        
//        else if (nums.length != 1 || nums.length != 2 || !(k>nums.length)) {
//            for (int i = nums.length - k; i <= nums.length-1; i++) {
//                arr[j++] = nums[i];
//            }
//
//            int g = 0;
//
//            for (int i = k; i < nums.length; i++) {
//                arr[i] = nums[g++];
//            }
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = arr[i];
//            }
//        } 
//        
//        else {}
//
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(Arrays.toString(nums));
//    }
//}
