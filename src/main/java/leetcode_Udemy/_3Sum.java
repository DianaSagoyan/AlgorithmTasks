package leetcode_Udemy;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
// and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= nums.length - 3; i++) {
            if(i == 0 || nums[i] != nums[i - 1]){
                int left = i + 1, right = nums.length - 1;
                int target = 0 - nums[i];

                while (left < right){
                    if (nums[left] + nums[right] == target){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[left]);
                        triplet.add(nums[right]);
                        list.add(triplet);

                        while (left < nums.length - 1 && nums[left] == nums[left + 1]) left++;
                        while (right > 0 && nums[right] == nums[right - 1]) right--;
                        left++;
                    } else if(nums[left] + nums[right] < target){
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
