package dsa_algos;

public class Task76_CombinationSumIV {
    public static void main(String[] args) {
        //Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
        //
        //The test cases are generated so that the answer can fit in a 32-bit integer.
        //Input: nums = [1,2,3], target = 4
        //Output: 7
        //Explanation:
        //The possible combination ways are:
        //(1, 1, 1, 1)
        //(1, 1, 2)
        //(1, 2, 1)
        //(1, 3)
        //(2, 1, 1)
        //(2, 2)
        //(3, 1)
        int[] nums = {1, 2, 3};
        int target = 4;

        System.out.println(combinationSum(nums, target));
    }

    public static int combinationSum(int[] nums, int target){
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++){
            for(int each: nums){
                if(i >= each) dp[i] += dp[i - each];
            }
        }
        return dp[dp.length - 1];
    }
}
