package dsa_algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task39_3Sum {
    public static void main(String[] args) {
        //Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
        // such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        //
        //Notice that the solution set must not contain duplicate triplets.

        
        //https://www.youtube.com/watch?v=Ca7k53qcTic

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){

        if(nums.length < 3 ) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i - 1]){
                int j = i + 1, k = nums.length - 1;

                while (j < k){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    } else if(sum > 0) k--;
                    else j++;
                }

            }
        }
        return result;
    }
}
