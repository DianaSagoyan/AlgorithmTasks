package dsa_algos;

public class Task24_StrictlyIncreasingArray {
    public static void main(String[] args) {
        //Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly
        // one element, or false otherwise. If the array is already strictly increasing, return true.
        //
        //The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).

        int[] nums = {2,3,1,2};
        System.out.println(strictlyIncreasing(nums));
    }

    public static boolean strictlyIncreasing(int[] nums){
        int count = 0;

        for(int i = 1; i < nums.length; i++){

            if(nums[i - 1] > nums[i]){
                count++;
                if(count > 1) return false;

                if(i > 1 && nums[i] <= nums[i - 2]){
                    nums[i] = nums[i - 1];
                }
            }


        }

        return true;
    }
}
