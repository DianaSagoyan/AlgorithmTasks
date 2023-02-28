package dsa_algos;

import java.util.HashMap;
import java.util.Map;

public class Task08_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        //Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
        // element appears only once. The relative order of the elements should be kept the same.
        //
        //Since it is impossible to change the length of the array in some languages, you must instead have the result
        // be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
        // then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
        //
        //Return k after placing the final result in the first k slots of nums.
        //
        //Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

        //Input: nums = [0,0,1,1,1,2,2,3,3,4]
        //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        //Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
        //It does not matter what you leave beyond the returned k (hence they are underscores).

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesInPlace(nums));
    }

    public static int removeDuplicatesInPlace(int[] nums){
       int result = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nums[result] = nums[i];
                result++;
            }
        }

       return result;
    }
}
