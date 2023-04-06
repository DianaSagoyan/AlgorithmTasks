package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 6, 9, 40};
        int key = 9;

        System.out.println(binarySearch(arr, key));
    }

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        int mid = (high + low) / 2;

        while (low <= high){
            if(arr[mid] > key) high = mid - 1;
            else if(arr[mid] < key) low = mid + 1;
            else return mid;

            mid = (high + low) / 2;
        }

        return -1;

    }
}
