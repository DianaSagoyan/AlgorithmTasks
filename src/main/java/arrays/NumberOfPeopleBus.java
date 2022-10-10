package arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberOfPeopleBus {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {10, 0});
        list.add(new int[] {3, 5});
        list.add(new int[] {2, 5});
        System.out.println(numOfPeople(list));
    }

    public static int numOfPeople(List<int[]> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i)[0] - list.get(i)[1];
        }
        return sum;
    }
}
