package dsa_algos;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task60_KthLargestElement {
    public static void main(String[] args) {
        //Given an integer array nums and an integer k, return the kth largest element in the array.
        //
        //Note that it is the kth largest element in the sorted order, not the kth distinct element.
        //
        //Can you solve it without sorting?

//        int[] nums = {3,2,3,1,2,4,5,5,6};
//        int k = 4;
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(kthLargestElement(nums, k));
    }

    public static int kthLargestElement(int[] nums, int k){
        Queue<Integer> pq = new PriorityQueue<>();

        for(int num: nums){
            pq.add(num);
            if(pq.size() > k) pq.poll();
        }
        return pq.poll();
    }
}
