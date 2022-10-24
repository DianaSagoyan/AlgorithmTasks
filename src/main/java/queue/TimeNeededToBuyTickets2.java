package queue;

public class TimeNeededToBuyTickets2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        int k = 2;
        System.out.println(timeNeededToBuyTickets(arr, k));
    }

    public static int timeNeededToBuyTickets(int[]arr, int k){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
//            if(i <= k)
                count += Math.min(arr[i], arr[k]);
//            else count += Math.min(arr[k] - 1, arr[i]);
        }

        return count;
    }
}
