package leetcode_Udemy;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Your goal is to find the maximum profit you can make by choosing one day to buy a stock and a different future day to sell it.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 5, 4, 3};
        System.out.println(bestTimeToBuyAndSellStocks(prices));
    }

    public static int bestTimeToBuyAndSellStocks(int[] prices){
        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i] - minPrice;
            profit = Math.max(profit, currentPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return profit;
    }
}
