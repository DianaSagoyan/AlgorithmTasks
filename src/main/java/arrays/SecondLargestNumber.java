package arrays;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 7, 8, 1};
        System.out.println(secondLargestNumberInTheArray(nums));
    }

    public static int secondLargestNumberInTheArray(int[] nums){
        nums = Arrays.stream(nums).sorted().toArray();
        return nums[nums.length - 2];


        //int highest = Integer.MIN_VALUE;
        //	int secondHighest = Integer.MIN_VALUE;
        //
        //	for (int i : array) {
        //		if (i > highest) {
        //			secondHighest = highest;
        //			highest = i;
        //		} else if (i > secondHighest) {
        //			secondHighest = i;
        //		}
        //
        //	}
        //	return secondHighest;
    }
}
