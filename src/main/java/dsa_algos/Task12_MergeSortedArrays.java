package dsa_algos;

import java.util.Arrays;

public class Task12_MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Ptr1 for first array Ptr2 for the second array .
        int ptr1 = m - 1;
        int ptr2 = n - 1;

        // And move i backwards from end through the array
        // write the smallest value pointed at by p1 or p2 to nums1.
        for (int i = m + n - 1; i >= 0; i--) {
            if (ptr2 < 0) {
                break;
            }
            if (ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]) {
                nums1[i] = nums1[ptr1--];
            } else {
                nums1[i] = nums2[ptr2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
