package dsa_algos;

public class Task20_MajorityElement {
    public static void main(String[] args) {
        //Given an array nums of size n, return the majority element.
        //
        //The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){

        int count = 1;
        int candidate = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(count == 0) candidate = nums[i];

            if(nums[i] == candidate) count++;
            else count--;

        }

        return candidate;

    }
}
