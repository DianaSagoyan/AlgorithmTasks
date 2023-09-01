package dsa_algos;

public class Task74_MissingNumber {
    public static void main(String[] args) {
        //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

        int[] nums = {0, 3, 4, 2, 5};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums){
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ i;
        }
        return xor;
    }
}
