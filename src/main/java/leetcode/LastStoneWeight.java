package leetcode;

import java.util.Arrays;

public class LastStoneWeight {
    public static void main(String[] args) {
        //You are given an array of integers stones where stones[i] is the weight of the ith stone.
        //
        //We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
        // Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
        //
        //If x == y, both stones are destroyed, and
        //If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
        //At the end of the game, there is at most one stone left.
        //
        //Return the weight of the last remaining stone. If there are no stones left, return 0.

        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones){

        int length = stones.length;
        while (length > 1){
            Arrays.sort(stones);
            int x = stones[length - 1] - stones[length - 2];
            length--;
            stones[length - 1] = x;
        }

        return stones[0];
    }
}
