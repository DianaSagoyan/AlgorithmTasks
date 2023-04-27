package dsa_algos;

import java.util.Arrays;

public class Task31_ConcatenationOfArray {
    public static void main(String[] args) {
        //Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
        // and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        //
        //Specifically, ans is the concatenation of two nums arrays.
        //
        //Return the array ans.

        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(arrayConcatenation(nums)));
    }

    public static int[] arrayConcatenation(int[] nums){
        int[] result = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i];
        }

        for(int i = nums.length, j = 0; i < result.length; i++, j++){
            result[i] = nums[j];
        }

        return result;
    }
}
