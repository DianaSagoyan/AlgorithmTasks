package dsa_algos;

public class Task33_MinimumCostToMoveChips {
    public static void main(String[] args) {
        //We have n chips, where the position of the ith chip is position[i].
        //
        //We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
        //
        //position[i] + 2 or position[i] - 2 with cost = 0.
        //position[i] + 1 or position[i] - 1 with cost = 1.
        //Return the minimum cost needed to move all the chips to the same position.

        int[] positions = {2, 2, 2, 3, 3};
        System.out.println(minCostToMoveChipsToSamePlace(positions));
    }

    public static int minCostToMoveChipsToSamePlace(int[] position){
        int even = 0, odd = 0;

        for(int i: position){
            if(i % 2 == 0) even++;
            else odd++;
        }

        if(odd == position.length || even == position.length) return 0;

        return Math.min(odd, even);
    }
}
