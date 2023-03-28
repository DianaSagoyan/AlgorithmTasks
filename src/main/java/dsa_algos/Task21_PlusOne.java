package dsa_algos;

import java.util.Arrays;

public class Task21_PlusOne {
    public static void main(String[] args) {
        //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
        // of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large
        // integer does not contain any leading 0's.
        //
        //Increment the large integer by one and return the resulting array of digits.

        int[] nums = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] nums){

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }
}
