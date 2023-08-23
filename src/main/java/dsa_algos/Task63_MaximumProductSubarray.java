package dsa_algos;

public class Task63_MaximumProductSubarray {
    public static void main(String[] args) {
        //Given an integer array nums, find a
        //subarray
        // that has the largest product, and return the product.
        //
        //The test cases are generated so that the answer will fit in a 32-bit integer.

        int[] nums = {2, 3, -2, 4};

        System.out.println(minProductSubarray(nums));
    }

    public static int minProductSubarray(int[] nums){

        int product = nums[0];
        int min = 1;
        int max = 1;

        for(int each: nums){
            if(each == 0){
                min = 1;
                max = 1;
                product = Math.max(each, product);
            } else {
                int temp = min;

                min = Math.min(each, Math.min(each * max, each * min));
                max = Math.max(each, Math.max(each * max, each * temp));

                product = Math.max(max, product);
            }
        }
        return product;
    }
}
