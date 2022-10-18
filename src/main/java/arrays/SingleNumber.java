package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 4, 3, 3};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr){

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}

//XOR operator 1^1 = 0     1^2=1
