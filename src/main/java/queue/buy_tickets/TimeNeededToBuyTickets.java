package queue.buy_tickets;

public class TimeNeededToBuyTickets {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        int k = 2;
        System.out.println(timeNeededToBuyTickets(arr, k));
    }

    public static int timeNeededToBuyTickets(int[]arr, int k){
        int count = 0;
        while (arr[k] != 0){

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != 0){
                    arr[i] -= 1;
                    count++;
                }
                if(i != k && arr[i] == 0) continue;
                else if(arr[k] == 0) {
                    break;
                }
            }

        }
        return count;
    }
}
