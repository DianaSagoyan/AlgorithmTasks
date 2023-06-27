package dsa_algos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Task48_TopKFrequentElements {
    public static void main(String[] args) {
        //Given an integer array nums and an integer k, return the
        // k most frequent elements. You may return the answer in any order.

        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequentElems(nums, k)));
    }

    public static int[] topKFrequentElems(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        Integer[] key = map.keySet().toArray(new Integer[0]);
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < key.length; i++) {
            pq.add(new Pair(key[i], map.get(key[i])));
        }

        for (int i = 0; i < k; i++) {
            result[i] = pq.remove().num;
        }
        return result;
    }

    public static class Pair implements Comparable<Pair>{

        int num;
        int count;

        public Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(Pair p) {
            return p.count - this.count;
        }
    }
}
