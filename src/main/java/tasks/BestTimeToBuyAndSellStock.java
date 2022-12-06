package tasks;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {2, 4, 1};
        System.out.println(maxProfitFromTransaction(prices));
    }

    public static int maxProfitFromTransaction(int[] prices){
        if(prices.length<=1) return 0;

        int min = Integer.MAX_VALUE;
        int result = 0;

        for(int i = 0; i < prices.length; i++){
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return result;
    }
}
