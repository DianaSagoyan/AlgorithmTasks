package dsa_algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task22_MinimumAbsoluteDifference {

    //Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
    //
    //Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> result = new ArrayList();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            if(Math.abs(arr[i] - arr[i + 1]) < min) min = Math.abs(arr[i] - arr[i + 1]);
        }

        for(int i = 0; i < arr.length - 1; i++){
            List<Integer> miniArr = new ArrayList();
            if(Math.abs(arr[i] - arr[i + 1]) == min){
                if(arr[i] < arr[i + 1]) {
                    miniArr.add(arr[i]);
                    miniArr.add(arr[i + 1]);
                } else {
                    miniArr.add(arr[i + 1]);
                    miniArr.add(arr[i]);
                }
                result.add(miniArr);
            }
        }

        return result;
    }
}
