package dsa_algos;

import java.util.HashSet;
import java.util.Set;

public class Task57_LongestConsecutiveSequence {
    public static void main(String[] args) {
        //Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
        //
        //You must write an algorithm that runs in O(n) time.

        //https://www.youtube.com/watch?v=P6RZZMu_maU

//        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums = {0, 8, 3, 2, 0, 1, 4, 6, 5, 7};
        System.out.println(longestConsecutiveSequence(nums));
    }

    public static int longestConsecutiveSequence(int[] nums){

        Set<Integer> set = new HashSet<>();
        int max = 0;

        for(int each: nums) set.add(each);

        for(int each: set){
            if(!set.contains(each - 1)){
                int current = each;
                int count = 1;

                while(set.contains(current + 1)){
                    current += 1;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
