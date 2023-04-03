package dsa_algos;

import java.util.Arrays;

public class Task27_SortSquareArray {
    public static void main(String[] args) {
        int[] nums = {-5, 7, -3, 20};
        System.out.println(Arrays.toString(squareArraySorted(nums)));
    }

    public static int[] squareArraySorted(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);
        return nums;
    }
}
