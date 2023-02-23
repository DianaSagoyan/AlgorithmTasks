package numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arraysHaveSameElements {
    public static void main(String[] args) {
        //Write Java program that checks if two arrays contain the same elements.
        Integer[] nums1 = {1, 2, 3, 2, 4};
        Integer[] nums2 = {1, 2, 3};
        System.out.println(containsSameElements(nums1, nums2));
    }

    public static boolean containsSameElements(Integer[] nums1, Integer[] nums2){

        Set<Integer> unique1 = new HashSet<>(Arrays.asList(nums1));
        Set<Integer> unique2 = new HashSet<>(Arrays.asList(nums2));

        if(unique1.size() != unique2.size()) return false;

        for(Integer each: unique1){
            if(!unique2.contains(each)) return false;
        }

        return true;
    }
}
