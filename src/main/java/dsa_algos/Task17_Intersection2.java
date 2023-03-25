package dsa_algos;

import java.util.*;

public class Task17_Intersection2 {
    public static void main(String[] args) {
        //Given two integer arrays nums1 and nums2, return an array of their intersection.
        // Each element in the result must be unique and you may return the result in any order.
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }

    public static int[] findIntersection(int[] nums1, int[] nums2){

        Set<Integer> set = new HashSet<>();

        for(int each: nums1) set.add(each);

        List<Integer> list = new ArrayList<>();

        for(int each: nums2){
            if(set.contains(each)) list.add(each);
            set.remove(each);
        }

        int[] result = new int[list.size()];
        int i = 0;

        for(Integer each: list){
            result[i++] = each;
        }
        return result;

    }
}
