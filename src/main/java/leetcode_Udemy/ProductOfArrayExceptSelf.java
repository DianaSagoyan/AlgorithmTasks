package leetcode_Udemy;

//Given an integer array nums, return an array answer such that
// answer[i] is equal to the product of all the elements of nums except nums[i].

//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int [] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(nums)));
    }

    public static int[] productOfArrayExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i -1];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            result[i] = suffix * result[i];
            suffix = suffix * nums[i];
        }

        return result;
    }
}
