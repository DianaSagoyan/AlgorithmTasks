package arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysHaveSameElements {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1, 4};
        int[] nums2 = {1, 1, 2, 2, 3, 2, 1};

        System.out.println(hasSameElems(nums1, nums2));
    }

    private static boolean hasSameElems(int[] nums1, int[] nums2){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        if(set1.size() != set2.size()) return false;

        for(Integer each: set1){
            if(!set2.contains(each)) return false;
        }

        return true;
    }
}
