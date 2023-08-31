package dsa_algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task72_FindPairs {
    public static void main(String[] args) {
        //Given 2 integer arrays arr1 and arr2 and an integer target find all pairs of integers such that 1 integer is from arr1
        // , the other is from arr2 and their sum equals the target value

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};

        int target = 7;
        System.out.println(findPairs(arr1, arr2, target));
    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){

        Set<Integer> set = new HashSet<>();
        List<int[]> result = new ArrayList<>();
        
        for(int each: arr1){
            set.add(each);
        }

        for(int each: arr2){
            if(set.contains(target - each)) result.add(new int[]{each, target - each});
        }

        return result;
    }
}
