package dsa_algos;

public class Task55_PeakIndexInMountainArray {
    public static void main(String[] args) {
        //An array arr is a mountain if the following properties hold:
        //
        //arr.length >= 3
        //There exists some i with 0 < i < arr.length - 1 such that:
        //arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        //arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        //Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
        //
        //You must solve it in O(log(arr.length)) time complexity.

        int[] mountain = {0, 1, 2, 1, 0};
        System.out.println(findPeakOfMountArray(mountain));
    }

    public static int findPeakOfMountArray(int[] mountain){

        int pointer1 = 0;
        int pointer2 = 1;
        int result = 0;

        while (pointer2 != mountain.length){
            if(mountain[pointer2] > mountain[pointer1]){
                pointer1++;
                pointer2++;
            }else {
                result = pointer1;
                break;
            }
        }
        return result;
    }
}
