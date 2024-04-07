package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
    //Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
    // four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    //
    //Example
    //
    //The minimum sum is  and the maximum sum is . The function prints

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279));
        minMaxSum(arr);
    }

    public static void minMaxSum(List<Integer> arr){
        long sum = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for(int each: arr){
            sum += each;

            if(each > max) max = each;
            if(each < min) min = each;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
