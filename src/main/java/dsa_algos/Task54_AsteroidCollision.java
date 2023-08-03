package dsa_algos;

import java.util.Arrays;
import java.util.Stack;

public class Task54_AsteroidCollision {
    public static void main(String[] args) {
        //We are given an array asteroids of integers representing asteroids in a row.
        //
        //For each asteroid, the absolute value represents its size, and the sign represents its direction
        // (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
        //
        //Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
        // If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

//        int[] asteroids = {10, 5, -2};
//        int[] asteroids = {8, -8};
//        int[] asteroids = {-5, 10};
        int[] asteroids = {10, 2, -5};

        System.out.println(Arrays.toString(asteroidCollisions(asteroids)));
    }

    public static int[] asteroidCollisions(int[] asteroids){

        Stack<Integer> stack = new Stack<>();

        for(int a : asteroids){

            while(!stack.isEmpty() && a < 0 && stack.peek() > 0){

                int diff = a + stack.peek();

                if(diff > 0) a = 0;
                else if(diff < 0) stack.pop();
                else {
                    stack.pop();
                    a = 0;
                }
            }
            if(a != 0) stack.push(a);
        }

        int[] result = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--){
            result[i] = stack.pop();
        }

        return result;
    }
}
