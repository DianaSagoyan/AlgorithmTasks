package dsa_algos;

import org.w3c.dom.ls.LSOutput;

public class Task59_MaximumSubarray {
    //Given an integer array nums, find the
    //subarray
    // with the largest sum, and return its sum.

    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubarray(nums));
    }

    public static int maxSubarray(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int each: nums){
            sum += each;

            if(sum < each) sum = each;
            if(max < sum) max = sum;
        }

        return max;
    }

}
