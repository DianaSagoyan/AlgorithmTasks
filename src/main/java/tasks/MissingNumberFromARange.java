package tasks;

import java.util.Arrays;

public class MissingNumberFromARange {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4};

        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){

        int num = nums.length;

        while (num >= 0){
            for (int i = 0; i < nums.length; i++) {
                if(num == nums[i]) break;
                else if(i == nums.length - 1 && num != nums[i]) return num;
            }
            num--;
        }
        return nums.length;
    }

}
