package leetcode;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3, n = 3;

        System.out.println(Arrays.toString(mergeSortedArrays(nums1, m, nums2, n)));
    }

    public static int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n){
        int pointer1 = m - 1;
        int pointer2 = n - 1;

        for (int i = m + n - 1; i >= 0 ; i--) {
            if(pointer2 < 0) return nums1;

            if(pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]) i = nums1[pointer1--];
            else i = nums2[pointer2--];
        }

        return nums1;
    }
}
