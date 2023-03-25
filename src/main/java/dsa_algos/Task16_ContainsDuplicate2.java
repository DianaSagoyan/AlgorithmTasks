package dsa_algos;

import java.util.HashMap;
import java.util.Map;

public class Task16_ContainsDuplicate2 {
    public static void main(String[] args) {
        //Given an integer array nums and an integer k, return true if there are two distinct indices i and j
        // in the array such that nums[i] == nums[j] and abs(i - j) <= k.

        int[] nums = {1,2,3,1};  int k = 3;   //true
//        int nums[] = {1, 2, 3, 1, 2, 3};  int k = 2;   //false

        System.out.println(containsDuplicate(nums, k));
    }

    public static boolean containsDuplicate(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) return true;
            else map.put(nums[i], i);

        }
        return false;
    }
}
