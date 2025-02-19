package leetcode_Udemy;

//Suppose you have an array of unique integers, initially sorted in ascending order. This array was rotated between 1 and n times,
// where n is the length of the array. For example:
//
//[4,5,6,7,0,1,2] is the result of rotating [0,1,2,4,5,6,7] four times.
//
//[0,1,2,4,5,6,7] remains the same after being rotated seven times.
//
//When an array is rotated once, the last element moves to the front. In general, rotating an array [a[0], a[1], a[2], ...,
// a[n-1]] one time results in [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//Given a sorted array that has been rotated, find the minimum element in the array.


public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(minInArray(nums));
    }

    public static int minInArray(int[] nums){
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < min) min = nums[i];
        }

        return min;
    }
}
