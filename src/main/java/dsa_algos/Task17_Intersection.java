package dsa_algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task17_Intersection {
    public static void main(String[] args) {
//        Given two integer arrays nums1 and nums2, return an array of their intersection. Each
//        element in the result must be unique and you may return the result in any order.

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }

    public static int[] findIntersection(int[] nums1, int[] nums2){
         Set<Integer> set = new HashSet<>();

         for(int i = 0; i < nums1.length; i++){
             for(int j = 0; j < nums2.length; j++){
                 if(nums1[i] == nums2[j]) set.add(nums1[i]);
             }
         }

         int[] result = new int[set.size()];

         int i = 0;

         for(Integer each: set){
             result[i++] = each;
         }

         return result;
    }
}
