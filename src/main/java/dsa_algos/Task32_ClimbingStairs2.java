package dsa_algos;

public class Task32_ClimbingStairs2 {
    public static void main(String[] args) {
        //You are climbing a staircase. It takes n steps to reach the top.
        //
        //Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        int n = 7;
        System.out.println(climbingStairs(n));
    }

    public static int climbingStairs(int num){
        if(num == 1) return 1;
        if(num == 2) return 2;

        int step1 = 0;
        int step2 = 1;
        int result = 0;

        while (num > 0){
            result = step1 + step2;
            step1 = step2;
            step2 = result;
            num--;
        }
        return result;
    }
}
