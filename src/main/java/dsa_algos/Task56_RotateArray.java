package dsa_algos;

import java.util.Arrays;

public class Task56_RotateArray {
    public static void main(String[] args) {
        //Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

        //https://www.youtube.com/watch?v=BHr381Guz3Y

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }

    public static int[] rotateArray(int[] nums, int k){
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
