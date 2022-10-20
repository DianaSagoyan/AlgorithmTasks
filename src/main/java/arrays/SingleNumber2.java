package arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 4, 3, 3};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr){

        Set<Integer> set = new HashSet<>();

        int sumOfAllElems = 0;
        int sumOfUniqueElems = 0;

        for (int i = 0; i < arr.length; i++) {
            if(set.add(arr[i])) sumOfUniqueElems += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sumOfAllElems += arr[i];
        }

        return 2 * sumOfUniqueElems - sumOfAllElems;
    }
}
