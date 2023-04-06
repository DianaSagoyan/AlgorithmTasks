package arrays;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(20);
        }

        System.out.println("Before");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter");
        printArray(numbers);
    }

    private static void mergeSort(int[] inputArray){
        int inputLength = inputArray.length;

        if(inputLength < 2){
            return;
        }
        int mid = inputLength / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputLength - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = inputArray[i];
        }

        for (int i = mid; i < inputLength; i++) {
            rightArray[i - mid] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            }  else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            inputArray[k] = leftArray[i];
            k++;
            i++;
        }

        while (j < rightArray.length) {
            inputArray[k] = rightArray[j];
            k++;
            j++;
        }
    }

    private static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
    }
}
