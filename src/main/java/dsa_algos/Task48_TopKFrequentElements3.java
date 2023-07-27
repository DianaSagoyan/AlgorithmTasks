package dsa_algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Task48_TopKFrequentElements3 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequentElems(nums, k)));
    }

    public static int[] topKFrequentElems(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        map.keySet().forEach(a -> pq.add(a));

        int[] result = new int[k];
        int i = 0;

        while (k --> 0) result[i++] = pq.poll();

        return result;
    }
}
