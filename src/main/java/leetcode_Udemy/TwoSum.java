package leetcode_Udemy;


//You are given an array of integers nums and an integer target. Your task is to find two distinct indices i and j such
// that the sum of nums[i] and nums[j] is equal to the target.
// You can assume that each input will have exactly one solution, and you may not use the same element twice.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 4};
        int[] arr = {-1, -2, -3, -4, -5};
//        int target = 6;
        int target = -8;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int targetVal = target - arr[i];
            if (map.containsKey(targetVal)) return new int[]{map.get(targetVal), i};
            else map.put(arr[i], i);
        }
        return new int[] {};
    }
}
