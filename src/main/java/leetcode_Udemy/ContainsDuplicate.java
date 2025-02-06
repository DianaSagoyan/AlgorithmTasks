package leetcode_Udemy;

//For a given array of integers, nums, return true if
// it contains duplicates. Otherwise, return false.

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}
