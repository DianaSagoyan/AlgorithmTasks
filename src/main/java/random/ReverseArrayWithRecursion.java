package random;

import java.util.Arrays;

public class ReverseArrayWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reversedArr(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reversedArr(int[] arr, int start, int end){
        if(start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reversedArr(arr, start + 1, end - 1);
    }
}
