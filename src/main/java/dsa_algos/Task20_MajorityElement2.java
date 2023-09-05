package dsa_algos;

import java.util.Arrays;

public class Task20_MajorityElement2 {
    public static void main(String[] args) {
        //Given an array nums of size n, return the majority element.
        //
        //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
