package stacks.sunset_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BuildingsWhichSeeSunset {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "west";

        System.out.println(buildingsThatSeeSunset(buildings, direction));
    }

    public static ArrayList<Integer> buildingsThatSeeSunset(int[] buildings, String direction) {

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        //East by default
        int i = 0;
        int step = 1;

        if (direction.equalsIgnoreCase("west")) {
            i = buildings.length - 1;
            step = -1;
        }
        while (i >= 0 && i < buildings.length) {
            while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
            i += step;
        }

        if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);


        result.addAll(stack);
        return result;
    }
}
