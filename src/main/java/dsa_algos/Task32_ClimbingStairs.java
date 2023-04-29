package dsa_algos;

public class Task32_ClimbingStairs {
    //You are climbing a staircase. It takes n steps to reach the top.
    //
    //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    public static void main(String[] args) {
        int n = 5;
        System.out.println(howManyWays(n));
    }

    public static int howManyWays(int n){
        if(n == 1) return 1;

        int stepOne = 1;
        int stepTwo = 2;

        for(int i = 3; i <= n; i++){
            int temp = stepTwo;
            stepTwo += stepOne;
            stepOne = temp;
        }
        return stepTwo;
    }
}
