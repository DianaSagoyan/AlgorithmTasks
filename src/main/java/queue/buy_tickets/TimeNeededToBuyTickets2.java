package queue.buy_tickets;

public class TimeNeededToBuyTickets2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 1};
        int k = 0;
        System.out.println(timeNeededToBuyTickets(arr, k));
    }

    public static int timeNeededToBuyTickets(int[]arr, int k){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i <= k)
                count += Math.min(arr[i], arr[k]);
            else count += Math.min(arr[k] - 1, arr[i]);
        }

        return count;
    }
}
