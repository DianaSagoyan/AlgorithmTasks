package random;

public class FindTheSecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10};

        System.out.println(secondLargestInArray(arr));
    }

    private static int secondLargestInArray(int[] arr){
        int max = arr[0];

        for(int i: arr){
            if(i > max) max = i;
        }

        int secondMax = max;
        int diff = Integer.MAX_VALUE;

        for(int i: arr){
            if(max - i < diff && max - i != 0) {
                diff = max - i;
                secondMax = i;
            }
        }

        return secondMax;
    }
}

