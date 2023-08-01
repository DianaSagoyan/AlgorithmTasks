package dsa_algos;

public class Task52_MinSizeSubarraySum {
    public static void main(String[] args) {
        //Given an array of positive integers nums and a positive integer target, return the minimal length of a
        //subarray
        // whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

        //https://www.youtube.com/watch?v=jKF9AcyBZ6E

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(numSubarraySum(nums, target));
    }

    public static int numSubarraySum(int[] nums, int target){

        int min = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target){
                min = Math.min(min, i + 1 - left);
                sum -= nums[left];
                left++;
            }
        }
        return (min != Integer.MAX_VALUE) ? min : 0;
    }
}
