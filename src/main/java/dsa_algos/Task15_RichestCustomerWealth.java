package dsa_algos;

public class Task15_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(richestCustomerWealth(accounts));
    }

    public static int richestCustomerWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int[] each: accounts){

            int sum = 0;
            for(int money: each){
                sum += money;
            }

            max = Math.max(sum, max);

        }

        return max;
    }
}
