package dsa_algos;

import java.util.Arrays;

public class Task13_MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroesToEnd(nums)));
    }

    public static int[] moveZeroesToEnd(int[] nums){

        int left = 0;
        int right = 1;

        while(right < nums.length){

            if(nums[left] != 0){
                left++;
                right++;
            } else if(nums[right] == 0){
                right++;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

        }
        return nums;

    }

}
