package dsa_algos;

import java.util.Arrays;

public class Task19_LargestPerimeterTriangle {
    public static void main(String[] args) {
        //Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of
        // these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

        int[] nums = {5, 4, 2, 3, 10};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums){

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2 ; i--) {
            if(nums[i] < nums[i - 1] + nums[i - 2]) return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }
}
