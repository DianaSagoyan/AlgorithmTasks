package leetcode_Udemy;


//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//
//Output: 6
//
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubarray(nums));
    }

    public static int maxSubarray(int[] nums){
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], nums[i] + current);
            max = Math.max(current, max);
        }

        return max;
    }
}
