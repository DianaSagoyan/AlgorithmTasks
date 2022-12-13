package tasks;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationOfPreviousAndNext {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        System.out.println(multiplicationOfPreviousAndNext(arr));
    }

    public static List<Integer> multiplicationOfPreviousAndNext(int[] arr){
        List<Integer> result = new ArrayList<>();

        result.add(arr[0] * arr[1]);

        int prev = 0;
        int next = 2;

        while (next != arr.length - 1){
            result.add(arr[prev] * arr[next]);
            prev++;
            next++;
        }

        result.add(arr[next] * arr[prev]);
        result.add(arr[next] * arr[next - 1]);

        return result;
    }
}
