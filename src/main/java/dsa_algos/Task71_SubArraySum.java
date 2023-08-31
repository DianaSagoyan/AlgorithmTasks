package dsa_algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task71_SubArraySum {
    public static void main(String[] args) {
        //Given an array of integers nums and a target integer, find the indices of a contiguous
        // subarray in nums that add up to the target sum using an HashMap

        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;

        System.out.println(Arrays.toString(subarraySum(nums, target)));
    }

    public static int[] subarraySum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(!map.containsKey(sum - target)){
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(sum - target) + 1, i};
            }
        }
        return new int[]{};
    }
}
