package dsa_algos;

import java.util.Arrays;
import java.util.Comparator;

public class Task10_SortingIntegersByTheNumberOf1Bits {
    //You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and
    // in case of two or more integers have the same number of 1's you have to sort them in ascending order.

    //Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
    //Output: [1,2,4,8,16,32,64,128,256,512,1024]
    //Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.

    public static void main(String[] args) {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};

        System.out.println(Arrays.toString(sortByBitsFirst(arr)));
    }

    public static int[] sortByBitsFirst(int[] arr){

        Integer[] temp = new Integer[arr.length];

        //Adds all elem ts of arr tp the temp
        Arrays.setAll(temp, i -> arr[i]);
        //sorts first with the bit count then with natural value, works with wrapper classes only
        Arrays.sort(temp, Comparator.comparingInt(Integer::bitCount)
                .thenComparing(Comparator.naturalOrder()));
        //sets all back to arr and returns it
        Arrays.setAll(arr, i -> temp[i]);

        return arr;
    }
}
