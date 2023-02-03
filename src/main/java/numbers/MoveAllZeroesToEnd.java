package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
          /*
    write a program that can move all the zeros to the end of the List of integers
     */
        int[] arr = {12, 17, 19, 0, 23, 0, 5, 0};
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }

    public static int[] moveZeroesToEnd(int[] arr){

        int pointer1 = 0;
        int pointer2 = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){
                pointer2 = arr[pointer1];
                arr[pointer1] = arr[i];
                arr[i] = pointer2;
                pointer1++;
            }
        }
        return arr;
    }

}
