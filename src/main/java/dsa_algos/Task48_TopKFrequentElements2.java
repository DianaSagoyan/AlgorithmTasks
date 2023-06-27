package dsa_algos;

import java.util.*;
import java.util.stream.Collectors;

public class Task48_TopKFrequentElements2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequentElems(nums, k)));
    }

    public static int[] topKFrequentElems(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        //Todo
        map.entrySet().stream().sorted(Map.Entry.comparingByValue());
        Integer[] keys = map.keySet().toArray(new Integer[0]);

        for (int i = 0; i < k; i++) {
            result[i] = keys[i];
        }

        return result;
    }
}
