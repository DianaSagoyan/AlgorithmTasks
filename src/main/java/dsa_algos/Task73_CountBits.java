package dsa_algos;

import java.util.Arrays;

public class Task73_CountBits {
    public static void main(String[] args) {
        //Given an integer n, return an array ans of length n + 1 such that for each
        //i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

        int num = 5;
        System.out.println(Arrays.toString(countBits(num)));
    }

    public static int[] countBits(int num){
        int[] result = new int[num + 1];
        result[0] = 0;
        int offset = 1;

        for (int i = 1; i <= num; i++) {
            if(2 * offset == i) offset = i;

            result[i] = 1 + result[i - offset];
        }
        return result;
    }
}
